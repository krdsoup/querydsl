package dsoup.querydsl.service

import dsoup.querydsl.entity.Lecture
import dsoup.querydsl.repository.LectureRepository
import org.springframework.stereotype.Service

@Service
class LectureService(
    val lectureRepository: LectureRepository
) {

    //@Transactional
    fun getLectureList(): List<Lecture> {
        val list = lectureRepository.getList()

        for(l in list){
            val lectureId = l.lectureId
            val lecturerName = l.lecturerName
            if(l.lectureId == 1L) {
                println("'$lectureId'번 타자 '$lecturerName'")
            }else{
                println("'$lectureId'번 투수 '$lecturerName'")
            }
        }

        return list
    }
}