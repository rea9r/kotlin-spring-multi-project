package com.amtkxa.adapter.createuser

import com.amtkxa.usecase.impl.createuser.CreateUserRequest
import com.amtkxa.usecase.impl.createuser.CreateUserUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CreateUserController(private val createUserUseCase: CreateUserUseCase) {
    @PostMapping(value = ["/api/user"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun create(@RequestParam(required = false) name: String,
               @RequestParam(required = false) country: String
    ): CreateUserViewModel {
        val request = CreateUserRequest(name = name, country = country)
        val presenter = CreateUserPresenter()
        createUserUseCase.execute(request, presenter)
        return presenter.createViewModel()
    }
}