package br.com.yan.controller

import br.com.yan.model.User
import br.com.yan.repository.UserRepository
import io.micronaut.data.annotation.Id
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponse.*
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import kotlinx.coroutines.flow.Flow
import java.net.URI
import java.util.*

@Controller("/users")
class UserController(private val users: UserRepository) {

    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun getAll(): HttpResponse<Flow<User>> = ok(users.findAll())

    @Get(uri = "/{id}", produces = [MediaType.APPLICATION_JSON])
    suspend fun getById(@PathVariable id: Long): HttpResponse<Any> {
        val user = users.findById(id) ?: return notFound()
        return ok(user)
    }

    @Post(consumes = [MediaType.APPLICATION_JSON])
    suspend fun create(@Body body: User): HttpResponse<Any> {
        val userSaved = users.save(body)
        //return created(URI.create("/users/" + userSaved.id))
        return create(body)
    }
}