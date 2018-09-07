package com.land.demo.controller

import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.BodyInserters.fromObject
import reactor.core.publisher.Mono
import org.springframework.web.reactive.function.server.ServerResponse


@RestController
class ContractController {

    //@Autowired
    //lateinit var ContractService contractService

    @GetMapping("/api/contract")
    fun find(): Mono<String> {
        return Mono.just("contract")
    }
}