/*
CSE 17 Fall 2019
@author (Your name)
Homework #3  	
Program: Student 
*/

import java.util.*;
import java.util.Arrays;

public class Student extends Person{
    private int numCourses = 0 ; 
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    //constructor
    public Student(String name, String address){
        super(name, address) ;

    }
    //returns a string of student name and address
    public String toString(){
        return ("Student: " + getName() + "(" + getAddress() + ")");
    }
    //returns a boolean 
    //adds a course to courses array if it doesnt already exist
    public void addCourseGrade(String course, int grade){
        for(int i = numCourses; i < courses.length; i++){
            courses[i] = course;
            break;
          }
        for(int i = numCourses; i < grades.length; i++){
            grades[i] = grade;
            break;
          }
          numCourses++;
        }    
    //calls the toStringMethod from this class
    //prints the class names and the grades
    public void printGrades(){
        System.out.print(toString() + " ");
        //int gradesLngth = numCourses;     
        for(int i = 0; i < 30;i++){
            if(courses[i]!=null|| grades[i]!=0 ){
            System.out.print(courses[i] + ":" + grades[i]+ " ");
            }
        }

    }
    //returns a double of the average grade of all grades
    public double getAverageGrade(){
        int gradesLngth = numCourses;
        double gradeSum = 0;
        for(int i =0; i<gradesLngth;i++){
            gradeSum += grades[i] ;
        }
        double averageGrade = gradeSum / gradesLngth ;
        return averageGrade;
    }
}