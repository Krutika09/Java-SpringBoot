// Interface: WHAT to do
interface Vehicle {
    void start();   // no body
}

// Class implements interface: HOW to do
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

// Using interface
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car(); // interface reference
        v.start();
    }
}
