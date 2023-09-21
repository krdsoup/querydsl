package dsoup.querydsl.entity

import jakarta.persistence.*

@Entity(name = "employee")
class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    val employeeId: Long = 0

    @Column(name = "employee_number")
    val employeeNumber: String = ""

    @Column(name = "password")
    val password: String = ""

    @Column(name = "name")
    val name: String = ""

    @Column(name = "authority")
    val authority: Int = 0

    @Column(name = "manager_employee_id")
    val managerEmployeeId: Long? = 0

    @Column(name = "create_time")
    val createTime: String = ""

    @Column(name = "update_time")
    val updateTime: String = ""

    @Column(name = "use_yn")
    val useYn: Int = 0

}