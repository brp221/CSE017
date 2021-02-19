/*
CSE 17 Fall 2019
@author (Your name)
Homework #3  	
Program: TestPerson 
*/


public class TestPerson extends Object{
    public static void main(String[] args){
        
        /* test Person class*/
        System.out.println("");
        System.out.println("PERSON CLASS:");
        Person person1 = new Person("Rick Sanchez", "C-137");
        System.out.println(person1.toString());
        person1.setName("Morty Smith");
        person1.setAddress("Planet Floop-Floopian");
        System.out.println("Edited person : " + person1.toString());
        System.out.println("person name:" + person1.getName());
        System.out.println("person address:" + person1.getAddress());
        System.out.println("");

        /* test Teachers class*/
        System.out.println("TEACHER CLASS: ");
        Teacher teacher1 = new Teacher("Mr.Miyagi","Japan");
        System.out.println(teacher1.toString());
        String[] courses = {"CSE002", "CSE109", "CSE002"} ;
        //adding all the classes
        for(int i = 0; i< courses.length; i++){
            String course  = courses[i];
            if(teacher1.addCourse(course)){ // returns boolean
                System.out.println(course + " has been added to teacher's schedule.");    
            }
            else{
                System.out.println(course + " cannot be added to teacher's schedule.");
            }
        }
        
        //removing all the classes
        for(int i = 0; i< courses.length; i++){
            String course  = courses[i];
            if(teacher1.removeCourse(course)){ // returns boolean
                System.out.println(course + " has been removed to teacher's schedule.");    
            }
            else{
                System.out.println(course + " cannot be removed to teacher's schedule.");
            }
        }
        System.out.println("");
        /* test Student class*/
        System.out.print("STUDENT CLASS:");
        Student student1 =  new Student("Slav Petkovic", "501 East 5th St");
        student1.toString();
        student1.addCourseGrade("CSE017", 100);
        student1.addCourseGrade("CALC023", 85);
        student1.addCourseGrade("PHYS021", 95);
        System.out.println("");
        student1.printGrades();
        System.out.println("");
        System.out.println("Average grade " + student1.getAverageGrade());
        System.out.println();
    }

}