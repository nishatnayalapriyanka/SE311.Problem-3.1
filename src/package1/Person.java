package package1;

public class Person {

    protected String name;

    Department d = new Department();

    public Person() {

    }

    public Person(String name, Department dept) {
        this.name = name;
        d = dept;
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Department : " + d.getName());
    }
}
