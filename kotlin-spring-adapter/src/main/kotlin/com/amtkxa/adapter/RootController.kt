package com.amtkxa.adapter

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class RootController {

    @GetMapping(path = ["/"])
    fun root(): ResponseEntity<String> {
        return ResponseEntity.ok("success")
    }
}