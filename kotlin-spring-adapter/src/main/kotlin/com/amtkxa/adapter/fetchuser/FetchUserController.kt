package com.amtkxa.adapter.fetchuser

import com.amtkxa.usecase.impl.fetchuser.FetchUserRequest
import com.amtkxa.usecase.impl.fetchuser.FetchUserUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class FetchUserController(private val fetchUserUseCase: FetchUserUseCase) {
    @GetMapping(value = ["/api/user"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun find(@RequestParam(required = false) name: String?,
             @RequestParam(required = false) country: String?
    ): List<FetchUserViewModel> {
        val request = FetchUserRequest(name = name, country = country)
        val presenter = FetchUserPresenter()
        fetchUserUseCase.execute(request, presenter)
        return presenter.createViewModel().userList
    }
}