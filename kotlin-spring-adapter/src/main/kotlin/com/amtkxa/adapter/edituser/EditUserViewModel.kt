package com.amtkxa.adapter.edituser

import java.time.LocalDateTime

data class EditUserViewModel(
        val userId: Long = 0,
        val name: String? = null,
        val country: String? = null,
        val updated: LocalDateTime = LocalDateTime.now()
) {
    class Builder {
        var userId: Long = 0
        var name: String? = null
        var country: String? = null
        var updated: LocalDateTime = LocalDateTime.now()

        fun build(): EditUserViewModel =
                EditUserViewModel(
                        userId = requireNotNull(userId),
                        name = requireNotNull(name),
                        country = requireNotNull(country),
                        updated = updated
                )

        companion object {
            fun build(f: Builder.() -> Unit): EditUserViewModel {
                val builder = Builder()
                builder.f()
                return builder.build()
            }
        }
    }
}