// This is a normal class
// It represents an Engine
class Engine {

    // This is a method of Engine class
    // It prints message when engine starts
    void start() {
        System.out.println("Engine Started");
    }
}

class Car {

    // This variable will hold Engine object
    // Car NEEDS Engine to work
    Engine engine;

    // This is the CONSTRUCTOR of Car class
    // Engine object is passed from outside into Car
    // This is called CONSTRUCTOR INJECTION
    Car(Engine engine) {

        // 'this.engine' = Car class variable
        // 'engine' = object received from outside
        // We are storing injected object into class variable
        this.engine = engine;
    }

    // This is a method of Car class
    void drive() {

        // Using injected Engine object
        engine.start();

        // Printing car moving message
        System.out.println("Car is moving");
    }
}
