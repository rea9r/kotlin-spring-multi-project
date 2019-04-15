package com.amtkxa.usecase.impl.fetchuser

import com.amtkxa.usecase.core.usecase.UseCase

@FunctionalInterface
interface FetchUserUseCase : UseCase<FetchUserRequest, FetchUserResponse>