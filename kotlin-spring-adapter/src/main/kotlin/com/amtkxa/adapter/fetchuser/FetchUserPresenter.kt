package com.amtkxa.adapter.fetchuser

import com.amtkxa.domain.entity.User
import com.amtkxa.usecase.core.presentation.Presenter
import com.amtkxa.usecase.impl.fetchuser.FetchUserResponse

class FetchUserPresenter : Presenter<FetchUserViewModelList>, FetchUserResponse {
    var fetchUserViewModelList = FetchUserViewModelList()

    override fun createView(): FetchUserViewModelList {
        return this.fetchUserViewModelList
    }

    override fun setUserList(userList: List<User>) {
        fetchUserViewModelList = convertToView(userList)
    }

    private fun convertToView(userList: List<User>): FetchUserViewModelList {
        val viewModelList = FetchUserViewModelList()
        userList.stream().forEach { user: User -> process(user, viewModelList) }
        return viewModelList
    }

    private fun process(user: User, viewModelList: FetchUserViewModelList) {
        val viewModel = FetchUserViewModel.Builder.build {
            id = user.id
            name = user.name
        }
        viewModelList.add(viewModel)
    }
}