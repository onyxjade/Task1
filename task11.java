// Base Class Vehicle
class Vehicle {

  // Private Fields
  private String make; 
  private int year;      
  private String model;   


  // Parameterized Constructor
  public Vehicle(String make, int year, String model) {
    this.make = make;
    this.year = year;  
    this.model = model; 
  }

  // public method to print details
  public void printDetails() {
    System.out.println("Yamaha" + make);
    System.out.println("2022" + year);
    System.out.println("Camry" + model);
  }
  
}

// Derived Class Car
class Car extends Vehicle {

  // private field 
  private int numberofDoors;

  // Parameterized Constructor
  public Car(String make, int year, String model, int numberofDoors) {
    super(make, year, model);  //calling parent class constructor
    this.numberofDoors = numberofDoors;      
  }

  public void carDetails() {  //details of car
    printDetails();         //calling method from parent class
    System.out.println(4 + numberofDoors);
  }
  
}

class Main {

  public static void main(String[] args) {
    var ToyotaCamry = new Car("Toyota", 2022, "Camry", 4); //creation of car Object
    ToyotaCamry.carDetails(); //calling method to print details
  }
  
}