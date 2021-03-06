require 'mysql2'
require 'singleton'

class Student
    attr_accessor :firstname, :lastname, :studentid

    def initialize()
        @firstname = nil
        @lastname = nil
        @studentid = nil
    end

    def initialize(studentid)
        @studentid = studentid
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("select lastname, firstname from student where studentid = ?")
        statement.execute(@studentid)
	statement.close()
    end

    def save()
        connection = DatabaseConnection.instance.connection    
 	statement = connection.prepare("select student set lastname = ?, firstname = ? where studentid = ?")
        statement.execute(@lastname, @firstname, @studentid)
        statement.close()
		
    end

    def add()
	connection = DatabaseConnection.instance.connection
	statement = connection.prepare("insert into student (studentid, firstname, lastname) values (?, ?, ?)")
	statement.execute(@studentid, @firstname, @lastname)
	statement.close()
    end

end

class DatabaseConnection
    include Singleton
    attr_reader :connection
    def initialize()
        @connection = Mysql2::Client.new(
            :host => 'localhost',
            :username => 'arthur',
            :password => 'usaf92',
            :database => 'security')
    end
end

class Facility
	attr_accessor :facilityid, :facilityname

    def initialize(facilityid)
        @facilityid = facilityid
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("select facilityname from facility where facilityid = ?")
        statement.execute(@facilityid)
        statement.close()
    end

    def save()
	connection = DatabaseConnection.instance.connection
        statement = connection.prepare("update facility set facilityname = ? where facilityid = ?")
        statement.execute(@facilityname, @facilityid)
        statement.close()
    end

    def add()
	connection = DatabaseConnection.instance.connection
        statement = connection.prepare("insert into facility (facilityid, facilityname) values (?,?)")
        statement.execute(@facilityid, @facilityname)
        statement.close()
    end
end

class Department
	attr_reader :facility, :facilityid
	attr_accessor :departmentid, :departmentname, :phonenumber

    def initialize(departmentid, facility, phonenumber)
	@departmentid = departmentid
	@facility = facility
	@facilityid = @facility.facilityid
	@phonenumber = phonenumber
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("select departmentname, phonenumber from department where departmentid = ?")
        statement.execute(@departmentid)
        statement.close()
	statement = connection.prepare("select facilityid from facility where facilityid = ?")
	statement.execute(@facility.facilityid)
	statement.close()
    end

    def save()
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("update department set departmentname = ?, facilityid = ?, phonenumber = ? where departmentid = ?")
        statement.execute(@departmentname, @facilityid, @phonenumber, @departmentid)
        statement.close() 
    end

    def add()
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("insert into department (departmentid, departmentname, facilityid, phonenumber) values (?,?,?,?)")
        statement.execute(@departmentid, @departmentname, @facilityid, @phonenumber)
        statement.close()
    end
end
class StudentWorker
	attr_reader :student, :studentid, :studentfirstname, :studentlastname, :department, :departmentname, :departmentid
	attr_accessor :workerid, :position
   
    def initialize(student, department, workerid, position)
        @student = student
	@studentid = @student.studentid
	@studentfirstname = @student.firstname
	@studentlastname = @student.lastname
	@department = department
	@departmentid = @department.departmentid
	@departmentname = @department.departmentname
        @workerid = workerid
        @position = position
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("select studentid, departmentid, position from studentworker where workerid = ? ")
        statement.execute(@workerid)
        statement.close()
        statement = connection.prepare("select studentid from student where studentid = ?")
        statement.execute(@studentid)
        statement.close()
	statement = connection.prepare("select departmentid from department where departmentid = ?")
	statement.execute(@departmentid)
	statement.close()
    end

    def save()
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("update studentworker set studentid = ?, departmentid = ?, position = ? where workerid = ?")
        statement.execute(@studentid, @departmentid, @position, @workerid)
        statement.close()
    end

    def add()
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("insert into studentworker (studentid, departmentid, workerid, position) values (?,?,?,?)")
        statement.execute(@studentid, @departmentid, @workerid, @position)
        statement.close()
    end
end

class Instruction
	attr_accessor :instructionid, :instructionname

    def initialize(id, name)
	@instructionid = id
	@instructionname = name
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("select instructionname from instruction where instructionid = ?")
        statement.execute(@instructionid)
        statement.close()
    end

    def save()
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("update instruction set instructionname = ? where instructionid = ?")
        statement.execute(@instructionname, @instructionid)
        statement.close()
    end

    def add()
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("insert into instruction (instructionid, instructionname) values (?,?)")
        statement.execute(@instructionid, @instructionname)
        statement.close()
    end
end

class IncidentReport
       attr_reader :studentworker, :workerid, :workerfirstname, :workerlastname, :instruction, :instructionid
        attr_accessor :incidentid, :date, :summary, :emergency
 
    def initialize(incidentid, studentworker, instruction, emergency)
        @studentworker = studentworker
        @workerid = @studentworker.workerid
        @workerfirstname = @studentworker.studentfirstname
        @workerlastname = @studentworker.studentlastname
        @incidentid = incidentid
        @instructionid = instruction.instructionid
        @emergency = emergency
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("select workerid, instructionid, emergency, summary, incidentdate from incident where incidentid = ?")
        statement.execute(@incidentid)
        statement.close()
        statement = connection.prepare("select workerid from studentworker where workerid = ?")
        statement.execute(@workerid)
        statement.close()
        statement = connection.prepare("select instructionid from instruction where instructionid = ?")
        statement.execute(@instructionid)
        statement.close()
    end

    def save()
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare("update incident set workerid = ?, instructionid = ?, emergency = ?, summary = ?, date = ? where incidentid = ?")
        statement.execute(@workerid, @instructionid, @emergency, @summary, @date, @incidentid) 
        statement.close()
    end

    def add()
        connection = DatabaseConnection.instance.connection
        statement = connection.prepare( "insert into incident (incidentid, workerid, instructionid, emergency, summary, incidentdate) values (?,?,?,?,?,?)")
        statement.execute(@incidentid, @workerid, @instructionid, @emergency, @summary, @date)
        statement.close()
    end
end

