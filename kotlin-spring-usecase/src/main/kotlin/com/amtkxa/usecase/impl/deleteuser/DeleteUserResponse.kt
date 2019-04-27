package com.amtkxa.usecase.impl.deleteuser

import com.amtkxa.usecase.core.usecase.Response

@FunctionalInterface
interface DeleteUserResponse : Response {
    fun setUserId(deletedUserId: Long)
}