package javaabstraction;
public class Main {
    public static void main(String[] args) {
        Car mySedan=new Sedan();
        System.out.println(mySedan.getStatus());
        mySedan.accelerate(60);
        System.out.println(mySedan.getStatus());
        Car myXuv=new Xuv();
        System.out.println(myXuv.getStatus());
        myXuv.start();
        System.out.println(myXuv.getStatus());      
    }
    
}
