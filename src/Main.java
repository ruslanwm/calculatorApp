import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int i = 0;

        while (i == 0) {

            System.out.println("emeliyyati sechin: +, -, *, /, X");
            String op = new Scanner(System.in).nextLine();

            if (op.equals("X")) {
                System.out.println("goodbye");
                break;
            }

            System.out.println("1ci eded:");
            double first = new Scanner(System.in).nextDouble();

            System.out.println("2ci eded:");
            double second = new Scanner(System.in).nextDouble();

            double result;



        if (op.equals("+")) {
             result = first + second;
            System.out.println("result:"+result);

        } else if (op.equals("-")) {

                result = first - second;
                System.out.println("result:" + result);
            } else if (op.equals("*")) {
                result = first * second;
                System.out.println("result:" + result);

            } else if (op.equals("/")) {
                result = first / second;
                System.out.println("result:" + result);
            }

        }
    }
}