package com.example.libraryone

import kotlinx.serialization.Serializable

@Serializable
sealed class Foo {
    @Serializable
    data object Bar: Foo()
    @Serializable
    data class Baz(val name: String) : Foo()
}
