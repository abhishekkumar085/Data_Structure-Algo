// public class sumOfDigits {

//     public static void main(String[] args) {
//         int n = 1234;

//         int sum = 0;
//         while (n != 0) {
//             sum = sum + n % 10;
//             n = n / 10;
//         }
//         System.out.println(sum);

//     }
// }
public class sumOfDigits {

    public static int f(int n) {
        if (n > 0 && n <= 9)
            return n;
        return f(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        int n = 1234;
        int sum = f(n);
        System.out.println(sum);
    }
}
