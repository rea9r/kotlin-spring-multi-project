package com.amtkxa.adapter.fetchuser

import java.time.LocalDateTime

data class FetchUserViewModel(
        val id: Long = 0,
        val name: String? = null,
        val updated: LocalDateTime = LocalDateTime.now()
) {
    class Builder {
        var id: Long = 0
        var name: String? = null
        var updated: LocalDateTime = LocalDateTime.now()

        fun build(): FetchUserViewModel =
                FetchUserViewModel(
                        id = requireNotNull(id),
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