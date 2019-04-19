package com.amtkxa.adapter.createuser

import java.time.LocalDateTime

data class CreateUserViewModel(
        val id: Long = 0,
        val name: String? = null,
        val country: String? = null,
        val updated: LocalDateTime = LocalDateTime.now()
) {
    class Builder {
        var id: Long = 0
        var name: String? = null
        var country: String? = null
        var updated: LocalDateTime = LocalDateTime.now()

        fun build(): CreateUserViewModel =
                CreateUserViewModel(
                        id = requireNotNull(id),
                        name = requireNotNull(name),
                        country = requireNotNull(country),
                        updated = updated
                )

        companion object {
            fun build(f: Builder.() -> Unit): CreateUserViewModel {
                val builder = Builder()
                builder.f()
                return builder.build()
            }
        }
    }
}