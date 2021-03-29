package ca.tetervak.timedialogdemo.util

import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

private val timeFormatter =
    DateTimeFormatter.ofPattern("h:mm a")

fun formatTime(date: Date?): String? {
    return date?.toInstant()
        ?.atZone(ZoneId.systemDefault())
        ?.toLocalTime()
        ?.format(timeFormatter)
}
