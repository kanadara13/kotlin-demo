package com.land.demo.handler

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RequestPredicates.accept
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions.route
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.HandlerFunction






//var contractRoute = ContractRoute();

@Component
class ContractHandler {

    //var helloWorld = { request -> ServerResponse.ok().body(fromObject("Hello World")) }

    /*RouterFunction<ServerResponse> personRoute =

    .andRoute(GET("/person").and(accept(APPLICATION_JSON)), handler::listPeople)
    .andRoute(POST("/person").and(contentType(APPLICATION_JSON)), handler::createPerson);*/
    /*fun getName(search: String): Mono<String> = repo.get(search).toMono().map { "Result: $it!" }
    fun addName(text: String): Mono<String> = repo.add(text).toMono().map { "Result: $it!" }
    fun getAllNames(): Flux<String> = repo.getAll().toFlux().map { "Result: $it" }*/
}

//class ContractRouter
/*fun router() {
    //GET("/route") { req -> ServerResponse.ok().body(fromObject(arrayOf(1, 2, 3))) }
}*/
//HandlerFunction<ServerResponse> a =