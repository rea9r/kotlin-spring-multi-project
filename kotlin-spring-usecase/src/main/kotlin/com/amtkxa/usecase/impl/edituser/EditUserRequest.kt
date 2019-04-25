package com.amtkxa.usecase.impl.edituser

import com.amtkxa.usecase.core.usecase.Request
import lombok.Builder
import lombok.Getter
import lombok.RequiredArgsConstructor

@Builder
@Getter
@RequiredArgsConstructor
class EditUserRequest(userId: Long, name: String?, country: String?) : Request {
    var userId: Long = userId
    var name: String = ""
    var country: String = ""

    init {
        this.userId = userId
        this.name = name ?: ""
        this.country = country ?: ""
    }
}