package com.amtkxa.usecase.impl.edituser

import com.amtkxa.domain.repository.UserRepository
import javassist.NotFoundException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class EditUserUseCaseImpl(private val userRepository: UserRepository) : EditUserUseCase {

    @Transactional(timeout = 30)
    override fun execute(request: EditUserRequest, response: EditUserResponse) {
        val user = userRepository.findById(request.userId).map { existingUser ->
            userRepository.save(existingUser.copy(
                    name = request.name,
                    country = request.country
            ))
        }.orElseThrow { NotFoundException("Specified user_id does not exist.") }
        response.setUser(user)
    }
}