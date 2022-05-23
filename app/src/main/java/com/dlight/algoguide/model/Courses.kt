package com.dlight.algoguide.model

data class Courses(var course_id: String? = null,
var course_title: String? = null,
var image: String? =null){
    constructor(): this("","","")
}
