package com.cep.user.dto;

import javax.validation.constraints.NotBlank;

public class CreateUserRequest {

  @NotBlank
  private String name;

  @NotBlank
  private String cep;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }
}
