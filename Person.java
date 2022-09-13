public class Person {
    String name;
    String addr;

    public Person() { // Default Constructor
        name = "abcd";
        addr = "delhi";
    }

    public Person(String name, String addr) { // Parameterised Constructor
        this.name = name;
        this.addr = addr;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    // Method Overloaded for displaying Object Attributes

    @Override
    public String toString() {
        return "Person [addr=" + addr + ", name=" + name + "]";
    }

}