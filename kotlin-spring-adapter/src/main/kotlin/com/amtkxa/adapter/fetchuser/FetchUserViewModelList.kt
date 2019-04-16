package com.amtkxa.adapter.fetchuser

class FetchUserViewModelList {
    val list = ArrayList<FetchUserViewModel>()

    fun add(fetchUserViewModel: FetchUserViewModel) {
        list.add(fetchUserViewModel)
    }
}