
require 'singleton'
require 'mysql2'

class NoRecordException < Exception
end

class Student
    attr_accessor :firstname, :lastname, :studentid

    def self.all_students()
      cnx = DatabaseConnection.instance.connection
      results = cnx.query("select firstname, lastname, studentid from student")
      students = []
      results.each do |row|
        s = Student.new
        s.studentid = row["studentid"]
        s.lastname = row["lastname"]
        s.firstname = row["firstname"]
        students << s
      end
      return students
    end

    def initialize(studentid = nil)
        @studentid = studentid
        if @studentid != nil
            cnx = DatabaseConnection.instance.connection
            stmt = cnx.prepare("select firstname, lastname from student where studentid = ?")
            results = stmt.execute(studentid)
            if results.entries.length != 1
                raise NoRecordException
            end
            record = results.entries[0]
            @firstname = record["firstname"]
            @lastname = record["lastname"]
            stmt.close()
        else
            @firstname = nil
            @lastname = nil
        end
    end

    def save()

        connection = DatabaseConnection.instance.connection
        if ! @studentid.nil?
            stmt = connection.prepare("update student set lastname = ?, firstname = ? where studentid = ?")
            stmt.execute(@lastname, @firstname, @studentid)
            stmt.close()
        else
            stmt = connection.prepare("insert into student (lastname, firstname) values (?, ?)")
            stmt.execute(@lastname, @firstname)
            stmt.close()
            results = connection.query("select last_insert_id() as id")
            record = results.entries[0]
            @studentid = record["id"]
        end
    end # end save method

end # end class Student

class DatabaseConnection
    include Singleton
    attr_reader :connection
    def initialize()
        @connection = Mysql2::Client.new(:host => "localhost",
            :username => "arthur",
            :password => "usaf92",
            :database => "security")
    end
end
