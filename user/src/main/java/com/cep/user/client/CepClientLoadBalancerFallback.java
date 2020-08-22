package com.cep.user.client;

import com.cep.user.exception.CepServiceDownException;
import com.cep.user.model.Cep;
import com.netflix.client.ClientException;

public class CepClientLoadBalancerFallback implements CepClient {

  private Exception exception;

  public CepClientLoadBalancerFallback(Exception exception) {
    this.exception = exception;
  }

  @Override
  public Cep getCep(String cep) {
    if (exception.getCause() instanceof ClientException) {
      throw new CepServiceDownException();
    }

    throw (RuntimeException) exception;
  }
}
