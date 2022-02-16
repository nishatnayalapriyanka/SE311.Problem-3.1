package package1;

public class Student extends Person {

    private String ID;
    private int batch ;
    private final int lastSerial = 3000;
    private static int count;
    /*if we change a static value in any obj of a class then ,
    changes are done for every obj of that class*/

    Semester s = new Semester();

    public Student(String name, Department dept, Semester sem, int batch) {
        super(name, dept);
        this.batch = batch;
        s = sem;
        count++;
        this.ID = generateID();
    }

    public String generateID() {
        int serial = lastSerial + count;
        return s.getCode() + "-" + d.getCode() + "-" + serial;
    }

    public void printInfo() {
        System.out.println("ID :" + ID);
        super.printInfo();
        System.out.println("Semester :" + s.getName());
        System.out.println("Batch :" + batch);
    }

}
