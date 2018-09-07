package com.land.demo.controller

import com.sun.org.apache.xpath.internal.operations.String
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono

@Controller
class ContractController {

    @GetMapping("/api/contract")
    fun find(): Mono<String>? {
        return null
    }
}