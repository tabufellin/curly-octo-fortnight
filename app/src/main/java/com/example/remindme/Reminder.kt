package com.example.remindme

class Reminder(
    val id: Long,          // An ID to uniquely identify the task
    val description: String, // The description of the task
    var howManyTimesPerDay: Int // A flag to indicate whether the task is completed
)
