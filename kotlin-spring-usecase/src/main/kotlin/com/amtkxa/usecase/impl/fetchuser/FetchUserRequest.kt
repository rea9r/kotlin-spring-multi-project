package com.amtkxa.usecase.impl.fetchuser

import com.amtkxa.usecase.core.usecase.Request
import lombok.Builder
import lombok.Getter
import lombok.RequiredArgsConstructor

@Builder
@Getter
@RequiredArgsConstructor
class FetchUserRequest : Request {
    val userId: Long = 0
}