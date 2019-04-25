package com.amtkxa.adapter.edituser

import com.amtkxa.domain.entity.User
import com.amtkxa.usecase.core.presentation.Presenter
import com.amtkxa.usecase.impl.edituser.EditUserResponse

class EditUserPresenter : Presenter<EditUserViewModel>, EditUserResponse {
    var editUserViewModel = EditUserViewModel()

    override fun createViewModel(): EditUserViewModel {
        return this.editUserViewModel
    }

    override fun setUser(user: User) {
        editUserViewModel = EditUserViewModel.Builder.build {
            userId = user.userId
            name = user.name
            country = user.country
        }
    }
}