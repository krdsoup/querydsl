package dsoup.querydsl.repository

import dsoup.querydsl.entity.Lecture

interface LectureRepository {

    fun getList(): List<Lecture>

}