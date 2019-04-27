package com.amtkxa.adapter.deleteuser

import com.amtkxa.usecase.core.presentation.Presenter
import com.amtkxa.usecase.impl.deleteuser.DeleteUserResponse

class DeleteUserPresenter : Presenter<DeleteUserViewModel>, DeleteUserResponse {
    var deleteUserViewModel = DeleteUserViewModel()

    override fun createViewModel(): DeleteUserViewModel {
        return this.deleteUserViewModel
    }

    override fun setUserId(deletedUserId: Long) {
        deleteUserViewModel = DeleteUserViewModel.Builder.build {
            userId = deletedUserId
        }
    }
}