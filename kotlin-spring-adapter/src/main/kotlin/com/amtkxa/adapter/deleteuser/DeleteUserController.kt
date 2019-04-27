package com.amtkxa.adapter.deleteuser

import com.amtkxa.usecase.impl.deleteuser.DeleteUserRequest
import com.amtkxa.usecase.impl.deleteuser.DeleteUserUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DeleteUserController(private val deleteUserUseCase: DeleteUserUseCase) {
    @DeleteMapping(value = ["/api/user/{userId}"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun edit(@PathVariable(value = "userId") userId: Long
    ): DeleteUserViewModel {
        val request = DeleteUserRequest(userId = userId)
        val presenter = DeleteUserPresenter()
        deleteUserUseCase.execute(request, presenter)
        return presenter.createViewModel()
    }
}