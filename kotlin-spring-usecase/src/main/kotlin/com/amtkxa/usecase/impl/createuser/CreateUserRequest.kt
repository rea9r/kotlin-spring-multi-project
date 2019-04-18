package com.amtkxa.usecase.impl.createuser

import com.amtkxa.usecase.core.usecase.Request
import lombok.Builder
import lombok.Getter
import lombok.RequiredArgsConstructor

@Builder
@Getter
@RequiredArgsConstructor
class CreateUserRequest(name: String?, country: String?) : Request {
    var userId: Long = 0
    var name: String = ""
    var country: String = ""

    init {
        this.name = name ?: ""
        this.country = country ?: ""
    }
}