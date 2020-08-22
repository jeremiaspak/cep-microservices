package com.cep.user.service;

import com.cep.user.client.CepClient;
import com.cep.user.entity.User;
import com.cep.user.model.Cep;
import com.cep.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository repository;

  @Autowired
  CepClient cepClient;

  public Iterable<User> findAll() {
    return repository.findAll();
  }

  public User create(String name, String cepNumber) {

    Cep cep = cepClient.getCep(cepNumber);
    User user = new User();
    user.setName(name);
    user.setLogradouro(cep.getLogradouro());
    user.setBairro(cep.getBairro());
    return repository.save(user);
  }
}
