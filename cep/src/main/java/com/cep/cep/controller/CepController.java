package com.cep.cep.controller;

import com.cep.cep.client.CepClient;
import com.cep.cep.service.CepService;
import com.cep.cep.model.Cep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepController {

  @Autowired
  private CepService cepService;

  @Autowired
  private CepClient cepClient;

  @GetMapping("/{cep}")
  public Cep getCep(@PathVariable String cep) {
    return cepService.getCep(cep);
  }
}
