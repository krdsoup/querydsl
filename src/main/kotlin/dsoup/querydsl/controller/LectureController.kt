package dsoup.querydsl.controller

import dsoup.querydsl.entity.Lecture
import dsoup.querydsl.service.LectureService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lecture")
class LectureController(
    val lectureService:LectureService
) {

    @GetMapping("/list")
    fun getLectureList() : List<Lecture> {
        return lectureService.getLectureList()
    }

}