package java_encapsulation;

public class Bike{
    private String brand;
    private String model;
    private int speed;
    private int maxSpeed;

    public Bike(String brand, String model) {
        this.brand = brand; // e.g., "Yamaha"   
        this.model = model;
        this.speed = 0; // Initial speed is 0
    }

    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;
            System.out.println("Accelerated to " + speed + " km/h");
        } else {
            System.out.println("Invalid acceleration value");
        }
    }

    public void brake(int decrement) {
        if (decrement > 0 && speed - decrement >= 0) {
            speed -= decrement;
            System.out.println("Decelerated to " + speed + " km/h");
        } else {
            System.out.println("Invalid brake value or speed too low");
        }
    }

    public void setMaxSpeed(int maxSpeed){
        if(maxSpeed>0){
            this.maxSpeed = maxSpeed;
            System.out.println("Max speed set to " + maxSpeed + " km/h");
        } else {
            System.out.println("Invalid max speed value");
        }
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getStatus() {
        return "Bike Brand: " + brand + ", Model: " + model + ", Speed: " + speed + " km/h";
    }

}