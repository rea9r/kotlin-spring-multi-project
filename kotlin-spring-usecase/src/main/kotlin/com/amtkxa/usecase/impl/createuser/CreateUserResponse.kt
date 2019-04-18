package com.amtkxa.usecase.impl.createuser

import com.amtkxa.domain.entity.User
import com.amtkxa.usecase.core.usecase.Response

@FunctionalInterface
interface CreateUserResponse : Response {
    fun setUser(user: User)
}