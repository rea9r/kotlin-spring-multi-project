package com.amtkxa.adapter.edituser

import com.amtkxa.usecase.impl.edituser.EditUserRequest
import com.amtkxa.usecase.impl.edituser.EditUserUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class EditUserController(private val editUserUseCase: EditUserUseCase) {
    @PostMapping(value = ["/api/user/{userId}"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun edit(@PathVariable(value = "userId") userId: Long,
             @RequestParam(required = false) name: String,
             @RequestParam(required = false) country: String
    ): EditUserViewModel {
        val request = EditUserRequest(userId = userId, name = name, country = country)
        val presenter = EditUserPresenter()
        editUserUseCase.execute(request, presenter)
        return presenter.createViewModel()
    }
}