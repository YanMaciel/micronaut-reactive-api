package br.com.yan.model

import io.micronaut.data.annotation.AutoPopulated
import io.micronaut.data.annotation.DateCreated
import io.micronaut.data.annotation.MappedEntity
import jakarta.persistence.Id
import java.time.LocalDateTime

@MappedEntity(value = "users")
data class User(

    @AutoPopulated
    @field:Id
    val id: Long? = null,

    var username: String = "",

    @field:DateCreated
    var createdAt: String? = LocalDateTime.now().toString()

)