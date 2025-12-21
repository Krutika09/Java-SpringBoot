class CreatingConstructor{ 
// Class name and constructor name must be same
    String name;  // Initializaing instance variable
    
    CreatingConstructor(){ // Constructor
        name = "Krutika";
    }
    
    public static void main(String[] args){
        // constructor called
        CreatingConstructor obj = new CreatingConstructor(); 
        System.out.println("Constructor is create by: " + obj.name);
    }
}
