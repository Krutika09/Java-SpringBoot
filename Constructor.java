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


class Student {

    Student() {   // constructor
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

        Student s1 = new Student();  // new keyword
    }
}
// 1. Student s1 = new Student();
// - यहाँ new keyword use हुआ
// - इससे Student का object बनता है
// 2. जैसे ही object बना
// - Constructor अपने आप call हो गया
