package com.cep.cep.service;

import com.cep.cep.client.CepClient;
import com.cep.cep.model.Cep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.stereotype.Service;

@Service
public class CepService {

  @Autowired
  private CepClient cepClient;

  @NewSpan("get-cep")
  public Cep getCep(@SpanTag("cep") String cep) {
    return cepClient.getCep(cep);
  }
}
