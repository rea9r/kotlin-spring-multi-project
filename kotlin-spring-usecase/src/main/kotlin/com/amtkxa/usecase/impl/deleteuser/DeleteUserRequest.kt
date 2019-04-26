package com.amtkxa.usecase.impl.deleteuser

import com.amtkxa.usecase.core.usecase.Request
import lombok.Builder
import lombok.Getter
import lombok.RequiredArgsConstructor

@Builder
@Getter
@RequiredArgsConstructor
class DeleteUserRequest(userId: Long) : Request {
    var userId: Long = userId

    init {
        this.userId = userId
    }
}