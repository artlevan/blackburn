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
 	statement = connection.prepare("update student set lastname = ?, firstname = ? where studentid = ?")
        statement.execute(@lastname, @firstname, @studentid)
        statement.close()
		
    end

    def add()
	connection = DatabaseConnection.instance.connection
	statement = connection.prepare( "INSERT INTO student (studentid, firstname, lastname) VALUES (?, ?, ?)")
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
