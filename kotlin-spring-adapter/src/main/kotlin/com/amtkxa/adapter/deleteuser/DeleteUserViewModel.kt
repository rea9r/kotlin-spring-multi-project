package com.amtkxa.adapter.deleteuser

data class DeleteUserViewModel(
        val userId: Long = 0
) {
    class Builder {
        var userId: Long = 0

        fun build(): DeleteUserViewModel =
                DeleteUserViewModel(
                        userId = requireNotNull(userId)
                )

        companion object {
            fun build(f: Builder.() -> Unit): DeleteUserViewModel {
                val builder = Builder()
                builder.f()
                return builder.build()
            }
        }
    }
}