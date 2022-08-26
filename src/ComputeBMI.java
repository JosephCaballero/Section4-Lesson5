
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello if you would like to calculate your bmi please enter 'x' ");
        String x = sc.next();
        if (x.equals("x")){
            System.out.println("Please enter your height (in inches): " );
            double height = sc.nextInt();
            System.out.println("Now please enter your weight(in pounds): ");
            double weight = sc.nextInt();
            double bmi = ((weight/height) * 30);
            System.out.println("Your BMI is: " + bmi);
        }
        else{
            System.out.println("Goodbye");
        }
        sc.close();

    }
}
