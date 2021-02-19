/*
CSE 17 Fall 2019
@author (Your name)
Homework #3  	
Program: Student 
*/

public class Teacher extends Person{
    int numCourses = 0;
    String[] courses = new String[5];
    //constructor
    public Teacher(String name, String address){
        super(name, address);
    }
    @Override
    public String toString(){
        return ("Teacher: " + this.name + "(" + this.address + ")");
    }
    //returns a boolean 
    //adds a course to courses array if it doesnt already exist
    public boolean addCourse(String course){
        boolean courseAdded = true;
        for(int i = 0; i < courses.length; i++){
            if(course.equalsIgnoreCase(courses[i])){
                courseAdded = false;
                break;
            }
        }
        if(courseAdded == true){
          for(int i = numCourses; i < courses.length; i++){
            courses[i] = course;
            break;
          }
          numCourses++;
        }
        return courseAdded;
    }
    //returns a boolean 
    //removes a course to courses array if it exists
    public boolean removeCourse(String course){
        boolean courseExists = false;
        for(int i = 0; i < courses.length; i++){
          if(course.equalsIgnoreCase(courses[i])){
                courseExists = true;
                courses[i] = null;
          }
        } 
        return courseExists;
    }
}