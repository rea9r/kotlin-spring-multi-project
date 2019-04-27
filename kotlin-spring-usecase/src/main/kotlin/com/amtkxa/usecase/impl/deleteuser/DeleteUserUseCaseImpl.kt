package com.amtkxa.usecase.impl.deleteuser

import com.amtkxa.domain.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class DeleteUserUseCaseImpl(private val userRepository: UserRepository) : DeleteUserUseCase {

    @Transactional(timeout = 30)
    override fun execute(request: DeleteUserRequest, response: DeleteUserResponse) {
        userRepository.deleteById(request.userId)
        response.setUserId(request.userId)
    }
}