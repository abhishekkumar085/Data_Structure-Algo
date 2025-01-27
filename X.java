class Employee{
    float salary=90000;
}
class Programmer extends Employee{
    int bonus=10000;
}
public class x {

    public static void main(String[] args) {
        
        Programmer p=new Programmer();
        System.out.println(p.bonus);
        System.out.println(p.salary);
    }
}
