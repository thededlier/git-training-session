import java.util.Scanner;


class Vehicle {
    String name;
    int numberOfCylinders;
    
    Vehicle(){
        
    }
}

class Truck extends Vehicle{
    double loadCapacity;
    int towingCapacity;
    
    void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter manufacturer name:");
        name=sc.nextLine();
        System.out.println("Enter number of cylinders:");
        numberOfCylinders=sc.nextInt();
        System.out.println("Enter load capacity:");
        loadCapacity=sc.nextDouble();
        System.out.println("Enter towing capacity:");
        towingCapacity=sc.nextInt();
    }
    
    void showDetails(){
        System.out.println("\nManufacturer: " +name);
        System.out.println("Number of cylinders: " +numberOfCylinders);
        System.out.println("Load capacity " +loadCapacity);
        System.out.println("Towing capacity:" +towingCapacity);
    }
}


class Car extends Vehicle{
    String brand;
    int seaters;
    float weight;
}

class SportsCar extends Car{
    double pickup;
    
    void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter brand name:");
        brand=sc.next();
        System.out.println("Enter number of seaters:");
        seaters=sc.nextInt();
        System.out.println("Enter weight in kg:");
        weight=sc.nextFloat();
        System.out.println("Enter pickup speed in 10seconds per km:");
        pickup=sc.nextDouble();
    }
    
    void showDetails(){
        System.out.println("Brand: " +brand);
        System.out.println("Seaters: " +seaters);
        System.out.println("Weight: " +weight);
        System.out.println("Pickup Speed: " +pickup);
    }
}

    
class ClsMain{
    public static void main(String args[]){
        Truck t=new Truck();
        SportsCar s=new SportsCar();
        
        t.getDetails();
        t.showDetails();
        
        s.getDetails();
        s.showDetails();
    }
}
