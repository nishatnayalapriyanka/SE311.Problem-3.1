package package2;

import package1.Department;
import package1.Semester;
import package1.Student;
import package1.Teacher;

public class Main {

    public static void main(String[] args) {
        Department dept = new Department("SWE", 35);
        Semester sem = new Semester("Spring-2022", 221);

        System.out.println("First Teacher :");
        Teacher teach1 = new Teacher("710001444", "Mr. Md. Mushfiqur Rahman", dept, "Lecturer");
        teach1.printInfo();

        System.out.println("\nSecond Teacher :");
        Teacher teach2 = new Teacher("710001281", "Md. Fahad Bin Zamal", dept, "Assistant Professor");
        teach2.printInfo();

        System.out.println("\nFirst Student :");
        Student stu1 = new Student("Priyanka", dept, sem, 31);
        stu1.printInfo();

        System.out.println("\nSecond Student :");
        Student stu2 = new Student("Ovi", dept, sem, 31);
        stu2.printInfo();

    }

}
/*
>Example 3.1 - Real Life Problem
You have to manage the information of your Teachers & Students of your class.
For Teacher’s info take ID, name, department, designation etc. 

During admission, take Student’s info i.e. name & other info…, 
Confirm admission semester, department & batch. 
Generate student ID such as 221-35-1234, 
where 221 is the admission semester code, 35 is the department code 
& 1234 is the serial number (cumulative) of the student. 

Keep the main class in a separate package.
Take 2 teachers info & 2 student’s info. and print their info.

*/