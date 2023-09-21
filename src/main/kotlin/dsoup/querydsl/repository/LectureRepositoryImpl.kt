package dsoup.querydsl.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import dsoup.querydsl.entity.Lecture
import dsoup.querydsl.entity.QEmployee
import dsoup.querydsl.entity.QLecture
import dsoup.querydsl.entity.QLectureHall
import org.springframework.stereotype.Repository

@Repository
class LectureRepositoryImpl (
    private val jpaQueryFactory: JPAQueryFactory
) : LectureRepository {

    override fun getList(): List<Lecture> {
        return jpaQueryFactory
            .selectFrom(QLecture.lecture)
            .innerJoin(QLectureHall.lectureHall)
            .on(QLecture.lecture.lectureHallId.eq(QLectureHall.lectureHall.lectureHallId))
            .fetch()
    }
}