package Java.OOPJAVA;

import java.util.Scanner;

class SumNumbers{
    int add(int a,int b){
        int sum=a+b;
        return sum;
    }
}

public class methos {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.print("Sum of two number " + x + " and " + y + " is  : " );

        SumNumbers adding=new SumNumbers();

        int ans=adding.add(x, y);
        System.out.println(ans);
        
    }
    
}
