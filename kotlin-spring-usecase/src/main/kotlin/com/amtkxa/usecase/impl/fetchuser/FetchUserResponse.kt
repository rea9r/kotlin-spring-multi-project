package com.amtkxa.usecase.impl.fetchuser

import com.amtkxa.domain.entity.User
import com.amtkxa.usecase.core.usecase.Response

@FunctionalInterface
interface FetchUserResponse : Response {
    fun setUser(user: User)
}