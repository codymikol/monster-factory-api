package com.codymikol.plugins

import com.codymikol.manager.BodyPartManager
import com.codymikol.manager.MonsterManager
import com.codymikol.manager.NewMonsterRequest
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.plugins.openapi.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

@Serializable
data class Error(
    val message: String,
)

fun Application.configureRouting() {

    install(CORS) {
        allowMethod(HttpMethod.Get)
        allowMethod(HttpMethod.Post)
        allowMethod(HttpMethod.Options)
        allowHeaders({ true })
        allowNonSimpleContentTypes = true
        anyHost()
    }

    routing {

        openAPI(path="openapi", swaggerFile = "openapi/documentation.yaml") {

        }

        get("/part") {

            val category = call.request.queryParameters["category"]
            val part = call.request.queryParameters["segment"]
            val creature = call.request.queryParameters["creature"]

            val stuff = BodyPartManager.getAllBodyParts(
                part = part,
                category = category,
                creature = creature
            )

            call.respond(stuff)

        }

        post("/monster") {

            headers {
               "Content-Type" to "application/json"
            }

            try {

                val newMonsterRequest = call.receive<NewMonsterRequest>()

                MonsterManager.createMonster(newMonsterRequest).fold(
                    { call.respond(it.code, Error(it.message)) },
                    { call.respond(it.asDto()) }
                )

            } catch (e: Exception) {
                call.respond(HttpStatusCode.BadRequest, Error("Invalid Monster, fields required are { name, leg, head, torso }"))
            }

        }

        staticResources("/assets", "assets", index = "index.html")

        staticResources("/", "root", index = "index.html")


    }
}
