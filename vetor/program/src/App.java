import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("AVERAGE HEIGHT!!!!");
        System.out.printf("Enter the amount of values: ");
        int n = sc.nextInt();
        System.out.printf("Enter the values: ");
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("Average height: %.2f\n ", avg);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        System.out.printf("Enter the amount of products: ");
        int x = sc.nextInt();

        Product[] vect2 = new Product[x];

        for (int y = 0; y < x; y++) {
            System.out.printf("Product's name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Product value: ");
            double price = sc.nextDouble();
            vect2[y] = new Product(name, price);
        }
        double sum2 = 0.0;
        for (int y = 0; y < x; y++) {
            sum2 += vect2[y].getPrice();
        }
        double avg2 = sum2 / n;
        System.out.printf("Avatage Price: %.2f\n", avg2);
        sc.close();
    }
}
