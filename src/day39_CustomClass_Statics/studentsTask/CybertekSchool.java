package day39_CustomClass_Statics.studentsTask;

import java.util.ArrayList;

public class CybertekSchool {

    public static void main(String[] args) {
        Student[] group1 = {
                new Student(), new Student(), new Student(), new Student(), new Student(),
                new Student(),new Student(),new Student(),new Student(), new Student()
        };
      //  group1[0].setInfo();

        Student[] group2 = {
                new Student(), new Student(), new Student(), new Student(), new Student(),
                new Student(),new Student(),new Student(),new Student(), new Student(),
                new Student()
        };
      //  group2[0].setInfo();

        Student[] group3 = {
                new Student(), new Student(), new Student(), new Student(), new Student(),
                new Student(),new Student(),new Student(),new Student(), new Student(),
                new Student(), new Student()
        };
       // group3[0].setInfo();

        System.out.println("-------------------------------------------");

        Student[][] groups = { group1, group2, group3};

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade MUST be A
        ArrayList<Student> avengers = new ArrayList<>();


        // who is the youngest earlyBird
        // who is the youngest avenger




    }

}

/*
2. Create a classNamed CybertekSchool
				1. create an Array of students that contains 10 Student objects
				2. print the name of the students who have a grade of B or A
				3. cretae two ArrayLists: femaleStudents, maleStudents

 */
