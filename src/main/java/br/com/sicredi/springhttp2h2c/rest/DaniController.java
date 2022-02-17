package br.com.sicredi.springhttp2h2c.rest;

import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@org.springframework.web.bind.annotation.RestController
public class DaniController {


    @GetMapping(path = "/hello/dani")
    public Mono<String> helloDani() {

        return Mono.just("Ola Dani");

    }


}
