package com.amtkxa.usecase.impl.edituser

import com.amtkxa.domain.entity.User
import com.amtkxa.usecase.core.usecase.Response

@FunctionalInterface
interface EditUserResponse : Response {
    fun setUser(user: User)
}