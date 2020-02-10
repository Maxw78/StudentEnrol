package enrolsystem

class BootStrap {

    def init = { servletContext ->

	def Course1 = new Course(department:'Computing', courseTitle:'BSc Hon Computing', courseLeader:'Dr Michelle Murphy', courseCode:'CS123', startDate:new Date('09/09/2019'), endDate:new Date('07/07/2023'), studyMode:'Fulltime', description:'Example Description', numberOfStudents:'55', tuitionFees:9000.60).save()

 def Course2 = new Course(department:'Geology', courseTitle:'BSc Hon Geology', courseLeader:'Dr Smith Smith', courseCode:'GG123', startDate:new Date('09/09/2019'), endDate:new Date('07/07/2023'), studyMode:'Fulltime', description:'Example Description', numberOfStudents:'35', tuitionFees:9000.50).save()

 def Course3 = new Course(department:'Smithing', courseTitle:'BSc Hon Smithing', courseLeader:'Mrs Dark Green', courseCode:'SM123', startDate:new Date('09/09/2019'), endDate:new Date('07/07/2023'), studyMode:'PartTime', description:'Example Description', numberOfStudents:'23', tuitionFees:9000.50).save()

def Student1 = new Student(
studentName:'Maxwell',
studentID:'b77',
dob:new Date('09/12/1999'),
 isFundingAvailable:'yes',
 studentEmail:'Max@gmail.com',
 studentUsername:'b8010777',
 studentPassword:'password',
 course:'Computing').save()

def Student2 = new Student(
studentName:'Jack',
studentID:'b88',
dob:new Date('01/02/2000'),
 isFundingAvailable:'yes',
 studentEmail:'Jack@gmail.com',
 studentUsername:'b9701888',
 studentPassword:'password',
 course:'Computing').save()

def Student3 = new Student(
studentName:'John',
studentID:'b40',
dob:new Date('02/12/2001'),
 isFundingAvailable:'yes',
 studentEmail:'John@gmail.com',
 studentUsername:'b8012340',
 studentPassword:'password',
 course:'Computing').save()

def Module1 = new Module(
module_title:'Database and Web',
module_code:'WaB',
credits:40,
lecturer:'Lynn',
course:'Computing',
description:'Database and web is about databases and web.').save()

def Module2 = new Module(
module_title:'Programming for Computing',
module_code:'PfC',
credits:20,
lecturer:'Peter',
course:'Computing',
description:'Computing is about Programming.').save()

def Module3 = new Module(
module_title:'Information for Buissness',
module_code:'ITB',
credits:20,
lecturer:'Lewis',
course:'Computing',
description:'Information for Buissness has all you need for IT in Buissness.').save()

def Lecturer1 = new Lecturer(
fullName:'Lynn',
post:'Post',
subject:'Computing',
lecturerEmail:'Lynn@gmail.com',
office:'Level3AB',
bio:'I am Lynn').save()

def Lecturer2 = new Lecturer(
fullName:'Peter',
post:'Post',
subject:'Computing',
lecturerEmail:'peter@gmail.com',
office:'Level2CB',
bio:'I am Peter').save()

def Lecturer3 = new Lecturer(
fullName:'Lewis',
post:'Post',
subject:'Computing',
lecturerEmail:'Lewis@gmail.com',
office:'Level1AA',
bio:'I am Lewis').save()


    }
    def destroy = {
    }
}
