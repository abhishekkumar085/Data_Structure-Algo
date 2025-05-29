package javaabstraction;
public class Sedan implements Car{
    private String status;
    public Sedan(){
        this.status="Sedan is parked!!";
    }

    @Override
    public void start(){
        status = "Sedan is started!!";
    }
    @Override
    public void stop(){
        status="Sedan is stopped!!";
    }
    @Override
    public void accelerate(int speed){
        status = "Sedan is accelerating at " + speed + " km/h!!";
    }
    @Override
    public void brake(int speed){
        status = "Sedan is braking at " + speed + " km/h!!";
    }
    @Override
    public String getStatus(){
        return status;
    }   
}