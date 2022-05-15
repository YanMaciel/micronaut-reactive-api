package br.com.yan.repository

import br.com.yan.model.User
import io.micronaut.data.annotation.Id
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.jpa.kotlin.CoroutineJpaSpecificationExecutor
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import io.micronaut.http.annotation.Post
import java.util.*

@R2dbcRepository(dialect = Dialect.MYSQL)
interface UserRepository: CoroutineCrudRepository<User, Long>, CoroutineJpaSpecificationExecutor<Post>