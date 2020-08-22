package com.cep.user.client;

import com.cep.user.model.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cep")
public interface CepClient {

  @GetMapping("/cep/{cep}")
  Cep getCep(@PathVariable String cep);
}
