package dsoup.querydsl.entity

import jakarta.persistence.*

@Entity(name = "lecture_hall")
class LectureHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_hall_id")
    val lectureHallId: Long = 0

    @Column(name = "lecture_hall_name")
    val lectureHallName: String = ""

    @Column(name = "employee_id")
    val employeeId: Long? = 0

    @Column(name = "create_time")
    val createTime: String = ""

    @Column(name = "update_time")
    val updateTime: String = ""

    @Column(name = "use_yn")
    val useYn: Int = 0

}