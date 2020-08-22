package com.cep.user.client;

import feign.Feign;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class CepClientConfigutarion {

  @Bean
  public ErrorDecoder getCepErrorDecoder() {
    return new CepClientDecoder();
  }

  @Bean
  public Feign.Builder builder() {
    FeignDecorators decorators = FeignDecorators.builder()
      .withFallback(new CepClientFallback(), RetryableException.class)
      .withFallbackFactory(CepClientLoadBalancerFallback::new, RuntimeException.class)
      .build();

    return Resilience4jFeign.builder(decorators);
  }
}
