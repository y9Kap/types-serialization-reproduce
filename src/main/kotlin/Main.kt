@file:UseSerializers(UserIdSerializer::class)

import app.meetacy.backend.types.UserId
import app.meetacy.backend.types.serialization.UserIdSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class User(val userId: UserId)

fun main() {
    println(Json.encodeToString(User(userId = UserId(0L))))
}
