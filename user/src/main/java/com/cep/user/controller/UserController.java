package com.cep.user.controller;

import com.cep.user.dto.CreateUserRequest;
import com.cep.user.dto.CreateUserResponse;
import com.cep.user.dto.GetUserResponse;
import com.cep.user.entity.User;
import com.cep.user.mapper.UserMapper;
import com.cep.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public Iterable<GetUserResponse> findAll() {
    return UserMapper.INSTANCE.userToGetUserResponse(
      userService.findAll()
    );
  }

  @PostMapping
  public CreateUserResponse create(@Valid @RequestBody CreateUserRequest userRequest) {
    return UserMapper.INSTANCE.userToCreateUserResponse(
      userService.create(userRequest.getName(), userRequest.getCep())
    );
  }
}
