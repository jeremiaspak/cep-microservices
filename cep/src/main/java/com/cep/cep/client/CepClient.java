package com.cep.cep.client;

import com.cep.cep.model.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/")
public interface CepClient {

  @GetMapping("/ws/{cep}/json/")
  Cep getCep(@PathVariable String cep);
}
