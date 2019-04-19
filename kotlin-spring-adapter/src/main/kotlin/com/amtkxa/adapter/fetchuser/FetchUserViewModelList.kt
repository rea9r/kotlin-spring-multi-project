package com.amtkxa.adapter.fetchuser

class FetchUserViewModelList {
    val userList = ArrayList<FetchUserViewModel>()

    fun add(fetchUserViewModel: FetchUserViewModel) {
        userList.add(fetchUserViewModel)
    }
}