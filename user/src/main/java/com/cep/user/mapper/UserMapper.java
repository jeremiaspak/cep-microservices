package com.cep.user.mapper;

import com.cep.user.dto.CreateUserRequest;
import com.cep.user.dto.CreateUserResponse;
import com.cep.user.dto.GetUserResponse;
import com.cep.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  GetUserResponse userToGetUserResponse(User user);
  Iterable<GetUserResponse> userToGetUserResponse(Iterable<User> users);

  User createUserRequestToUser(CreateUserRequest userRequest);
  CreateUserResponse userToCreateUserResponse(User user);
}

