package java_encapsulation;

public class Main{
    public static void main(String[] args){
        System.out.println("This is the example of Encapsulation");
        Bike myBike=new Bike("Hero","Splendor");
        System.out.println(myBike.getStatus()); 
        myBike.setMaxSpeed(100);
        System.out.println("Max Speed: " + myBike.getMaxSpeed() + " km/h");
        System.out.println(myBike.getStatus());
        
    }
}