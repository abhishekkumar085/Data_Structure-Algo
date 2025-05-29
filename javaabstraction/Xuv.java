package javaabstraction;

public class Xuv implements Car {
    private String status;
    public Xuv() {
        this.status = "XUV is parked!!";
    }
    @Override
    public void start(){
        status = "XUV is started!!";
    }
    @Override
    public void stop(){
        status = "XUV is stopped!!";
    }
    @Override
    public void accelerate(int speed){
        status = "XUV is accelerating at " + speed + " km/h!!";
    }
    @Override
    public void brake(int speed){
        status = "XUV is braking at " + speed + " km/h!!";
    }
    @Override
    public String getStatus() {
        return status;
    }  
}
