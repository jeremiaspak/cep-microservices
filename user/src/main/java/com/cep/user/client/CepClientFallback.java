package com.cep.user.client;

import com.cep.user.exception.CepServiceDownException;
import com.cep.user.model.Cep;

public class CepClientFallback implements CepClient {

  @Override
  public Cep getCep(String cep) {
    throw new CepServiceDownException();
  }
}
