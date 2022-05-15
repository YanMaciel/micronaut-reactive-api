package br.com.yan.model

import io.micronaut.data.annotation.*
import jakarta.persistence.Id
import java.time.LocalDateTime
import java.util.*

@MappedEntity(value="users")
data class User(

    @AutoPopulated
    @field:Id
    val id: Long? = null,

    var username: String = "",

    @field:DateCreated
    var createdAt: String? = LocalDateTime.now().toString()

)