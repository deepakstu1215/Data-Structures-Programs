//Abstract Class Demo
public abstract class Student extends Person {
    int rollNo;

    // Parameterised Constructor
    public Student(String name, String addr, int rollNo) {
        super(name, addr);
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student [addr=" + addr + ", name=" + name + ", rollNo=" + rollNo + "]";
    }

    // Defining an abstract method
    public abstract void demo1();

    // Defining a normal method
    public void display() {
        System.out.println("Hello from Demo class");
    }

}
