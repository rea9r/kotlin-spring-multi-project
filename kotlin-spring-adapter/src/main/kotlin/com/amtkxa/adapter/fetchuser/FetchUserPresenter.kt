package com.amtkxa.adapter.fetchuser

import com.amtkxa.domain.entity.User
import com.amtkxa.usecase.core.presentation.Presenter
import com.amtkxa.usecase.impl.fetchuser.FetchUserResponse

class FetchUserPresenter : Presenter<FetchUserViewModelList>, FetchUserResponse {
    var fetchUserViewModelList = FetchUserViewModelList()

    override fun createViewModel(): FetchUserViewModelList {
        return this.fetchUserViewModelList
    }

    override fun setUserList(userList: List<User>) {
        fetchUserViewModelList = toViewModel(userList)
    }

    private fun toViewModel(userList: List<User>): FetchUserViewModelList {
        val viewModelList = FetchUserViewModelList()
        userList.stream().forEach { user: User -> process(user, viewModelList) }
        return viewModelList
    }

    private fun process(user: User, viewModelList: FetchUserViewModelList) {
        val viewModel = FetchUserViewModel.Builder.build {
            userId = user.userId
            name = user.name
            country = user.country
        }
        viewModelList.add(viewModel)
    }
}