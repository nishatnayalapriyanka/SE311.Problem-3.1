package package1;

public class Teacher extends Person {

    private String ID, designation;

    public Teacher(String ID, String name, Department dept, String designation) {
        super(name, dept);
        this.ID = ID;
        this.designation = designation;
    }

    public void printInfo() {
        System.out.println("ID :" + ID);
        super.printInfo();
        System.out.println("Designation : " + this.designation);
    }

}
