package enrolsystem

class BootStrap {

    def init = { servletContext ->

	new Course(department:'Computing', courseTitle:'BSc Hon Computing', courseLeader:'Dr Michelle Murphy', courseCode:'CS123', startDate:new Date('09/09/2019'), endDate:new Date('07/07/2023'), studyMode:'Fulltime', description:'Example Description', numberOfStudents:'55', tuitionFees:9000.60).save()

new Course(department:'Geology', courseTitle:'BSc Hon Geology', courseLeader:'Dr Smith Smith', courseCode:'GG123', startDate:new Date('09/09/2019'), endDate:new Date('07/07/2023'), studyMode:'Fulltime', description:'Example Description', numberOfStudents:'35', tuitionFees:9000.50).save()

new Course(department:'Smithing', courseTitle:'BSc Hon Smithing', courseLeader:'Mrs Dark Green', courseCode:'SM123', startDate:new Date('09/09/2019'), endDate:new Date('07/07/2023'), studyMode:'PartTime', description:'Example Description', numberOfStudents:'23', tuitionFees:9000.50).save()

    }
    def destroy = {
    }
}
