package dsoup.querydsl.entity

import jakarta.persistence.*

@Entity(name = "lecture")
class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_id")
    val lectureId: Long = 0

    @Column(name = "lecture_hall_id")
    val lectureHallId: Long = 0

    @Column(name = "lecturer_name")
    val lecturerName: String = ""

    @Column(name = "lecture_title")
    val lectureTitle: String = ""

    @Column(name = "lecture_contents")
    val lectureContents: String = ""

    @Column(name = "lecture_start_time")
    val lectureStartTime: String = ""

    @Column(name = "lecture_end_time")
    val lectureEndTime: String = ""

    @Column(name = "lecture_seats_max")
    val lectureSeatsMax: Int = 0

    @Column(name = "employee_id")
    val employeeId: Long? = 0

    @Column(name = "create_time")
    val createTime: String = ""

    @Column(name = "update_time")
    val updateTime: String = ""

    @Column(name = "use_yn")
    val useYn: Int = 0

}