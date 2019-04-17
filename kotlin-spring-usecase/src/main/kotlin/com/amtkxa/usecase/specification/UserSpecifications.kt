package com.amtkxa.usecase.specification

import com.amtkxa.domain.entity.User
import org.springframework.data.jpa.domain.Specification
import org.springframework.util.StringUtils

class UserSpecifications {
    companion object {
        fun nameContains(name: String): Specification<User>? {
            return if (StringUtils.isEmpty(name))
                null
            else
                Specification { root, query, cb ->
                    cb.like(root.get("name"), "%$name%")
                }
        }

        fun countryContains(country: String): Specification<User>? {
            return if (StringUtils.isEmpty(country))
                null
            else
                Specification { root, query, cb ->
                    cb.like(root.get("country"), "%$country%")
                }
        }
    }
}
