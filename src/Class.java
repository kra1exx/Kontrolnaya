import java.util.Scanner;

public class Class {
    private static double len(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
    }
    private static int factorial(int num) {
        if (num == 1)
            return 1;
        return num * factorial(num - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println(((year % 4 == 0) && (year % 100 != 0)) ? "YES" : "NO");
        int num = sc.nextInt();
        sc.nextLine();
        if (num < 2)
            System.out.println("Число у вас неправильное");
        else
        {
            boolean found = false;
            for (int i = 2; i*i <= num; i++)
            {
                if (num % i == 0)
                {
                    System.out.println(i);
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println(num);
        }
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble(), x3 = sc.nextDouble(), y3 = sc.nextDouble();
        sc.nextLine();
        System.out.println(len(x1, y1, x2, y2) + len(x1, y1, x3, y3) + len(x2, y2, x3, y3));
        System.out.println(factorial(sc.nextInt()));
    }
}