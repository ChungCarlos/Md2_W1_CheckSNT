import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println(num + " is not prime");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println("SNT");
            } else {
                System.out.println("not SNT");
            }
        }
    }
}



//        System.out.println(check(num));
//    }
//    public static boolean check(int num) {
//        if (num < 2) {
//            System.out.println(num + " is not prime");
//        } else {
//            int i;
//            for (i = 2; i <= num / 2; i++) {
//                if (num % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
//        return true;
//    }
