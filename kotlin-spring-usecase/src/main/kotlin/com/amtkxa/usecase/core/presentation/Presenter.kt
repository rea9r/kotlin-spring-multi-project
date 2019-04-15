package com.amtkxa.usecase.core.presentation

import com.amtkxa.usecase.core.usecase.Response

@FunctionalInterface
interface Presenter<V> : Response {
    fun createView(): V?
}