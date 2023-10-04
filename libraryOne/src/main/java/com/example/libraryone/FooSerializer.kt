package com.example.libraryone

import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val fooSerializersModule = SerializersModule {
    polymorphic(Foo::class) {
        subclass(Foo.Bar::class, Foo.Bar.serializer())
        subclass(Foo.Baz::class, Foo.Baz.serializer())
    }
}