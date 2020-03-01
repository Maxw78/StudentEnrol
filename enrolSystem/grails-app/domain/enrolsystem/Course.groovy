package enrolsystem

class Course {

	String department
	String courseTitle
	Lecturer courseLeader
	String courseCode
	Date startDate
	Date endDate
	String studyMode
	String description
	int numberOfStudents
	Double tuitionFees
	String toString(){
	return courseTitle
	}
	static hasMany=[lecturers: Lecturer, students:Student, modules:Module]

	

    static constraints = {
	department nullable: false, blank: false
	courseTitle nullable: false, blank: false
	courseLeader nullable: false, blank: false
	courseCode nullable: false, blank: false
	numberOfStudents nullable: false, blank: false, min:20, max:60
	startDate nullable: false, blank: false
	endDate nullable: false, blank: false
	studyMode nullable: false, blank: false, maxSize: 20
	description nullable: false, blank: false, maxSize: 5000, widget:'textarea'
	tuitionFees nullable: false, blank: false, scale: 2
	
	
    }
}
