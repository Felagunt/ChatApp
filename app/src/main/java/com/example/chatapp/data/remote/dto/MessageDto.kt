package com.example.chatapp.data.remote.dto

import com.example.chatapp.domain.model.Message
import kotlinx.serialization.Serializable
import java.text.DateFormat
import java.util.Date

@Serializable
data class MessageDto(
    val text: String,
    val timestamp: String,
    val username: String,
    val id: String
) {
    fun toMessage(): Message {
        val date = DateFormat
            .getDateInstance(DateFormat.DEFAULT)
            .format(timestamp)

        return Message(
            text = text,
            formattedTime = date,
            username = username
        )
    }
}
