package com.amtkxa.adapter.fetchuser

import java.time.LocalDateTime

data class FetchUserViewModel(
        val userId: Long = 0,
        val name: String? = null,
        val updated: LocalDateTime = LocalDateTime.now()
) {
    class Builder {
        var userId: Long = 0
        var name: String? = null
        var updated: LocalDateTime = LocalDateTime.now()

        fun build(): FetchUserViewModel =
                FetchUserViewModel(
                        userId = requireNotNull(userId),
                        name = requireNotNull(name),
                        updated = updated
                )

        companion object {
            fun build(f: Builder.() -> Unit): FetchUserViewModel {
                val builder = Builder()
                builder.f()
                return builder.build()
            }
        }
    }
}