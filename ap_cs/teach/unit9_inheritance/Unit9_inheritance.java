package ap_cs.unit9_inheritance;
import java.util.ArrayList; 

public class Unit9_inheritance {
    public static void main(String[] args) {
        Vehicle vehicle =new Vehicle("Vehicle", "Ford", "Focus");
        // vehicle.run();
        // vehicle.run(5);
        Train train =new Train();//new Vehicle("Train1", "Ford", "Focus");
        // train.run();
        // train.run(3);


        ArrayList<Vehicle> vList= new ArrayList<Vehicle>(); 
        vList.add(vehicle);
        vList.add(train);
        System.out.println((vList.size()));


    }
    
}


class Vehicle {
    //properties: 
    //1. field
    
    public String name = "default name";
    public String make = "default make";
    public String model = "default model";
    //2. function
    public void run() {
        System.out.println(this.name + " is running , made by " + this.make + ", the model is " + this.model);
    }
    // public Vehicle() {
    //     this.make = "Vehicle make";
    //     this.name = "Vehicle name";
    // }
    public Vehicle(String name, String make, String model) {
        this.name = name;
        this.make = make;
        this.model = model;

    }
}

// "is-a xxx relationship"
// Train inheritance from Vehicle, train is a vehicle
// Car inheritance from Vehicle,  car is a vehicle
// Train - subclass, pull over all the properties from the parents except the constructor
// Vehicle - parent class
class Train extends Vehicle {
    public Train() {
        super("train name", "train make", "train model");
        // this.name = "Train name";
    }
    //override
    public void run() {
        System.out.println(this.name + " is a train and it is running , made by " + this.make + ", the model is " + this.model);
    }
     //overload
    public void run(int a) {
        System.out.println(this.name + " is a train and it is running "+ a +"times, made by " + this.make + ", the model is " + this.model);
    }
}
