package com.amtkxa.usecase.impl.createuser

import com.amtkxa.domain.entity.User
import com.amtkxa.domain.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CreateUserUseCaseImpl(private val userRepository: UserRepository) : CreateUserUseCase {

    @Transactional(timeout = 30)
    override fun execute(request: CreateUserRequest, response: CreateUserResponse) {
        val user = userRepository.save(User(
                name = request.name,
                country = request.country
        ))
        response.setUser(user)
    }
}