import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        float f =  take.nextFloat();
        float kdv = 0;
        if (f >= 1000)
        {
            kdv = 0.8f;
        }
        else {
            kdv = 0.18f;
        }
        System.out.println("Tax percentage: " + kdv);
        System.out.println("Tax: " + (f*kdv));
        System.out.println("Total: " + (f+f*kdv));
    }
}
