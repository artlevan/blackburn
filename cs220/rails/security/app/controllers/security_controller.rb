class SecurityController < ApplicationController
  def viewasinglestudent
    studentid = params[:studentid]
    @student = Student.new(studentid)
    render 'viewstudent'
  end

  def editstudent
    studentid = params[:studentid]
    @student = Student.new(studentid)
    render 'editstudent'
  end

  def addstudent
    render 'addstudent'
  end

  def savestudent
    studentid = params[:studentid]
    @student = Student.new(studentid)
    @student.firstname = params[:firstname]
    @student.lastname = params[:lastname]
    @student.save
    render 'viewstudent'
  end

end
