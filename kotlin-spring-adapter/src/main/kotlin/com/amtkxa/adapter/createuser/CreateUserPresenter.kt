package com.amtkxa.adapter.createuser

import com.amtkxa.domain.entity.User
import com.amtkxa.usecase.core.presentation.Presenter
import com.amtkxa.usecase.impl.createuser.CreateUserResponse

class CreateUserPresenter : Presenter<CreateUserViewModel>, CreateUserResponse {
    var createUserViewModel = CreateUserViewModel()

    override fun createViewModel(): CreateUserViewModel {
        return this.createUserViewModel
    }

    override fun setUser(user: User) {
        createUserViewModel = CreateUserViewModel.Builder.build {
            userId = user.userId
            name = user.name
            country = user.country
        }
    }
}