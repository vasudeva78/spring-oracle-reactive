package com.reactive.spring.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.reactive.spring.oracle")
public class OracleReactiveApplication {

  public static void main(String[] args) {
    SpringApplication.run(OracleReactiveApplication.class, args);
  }
}
