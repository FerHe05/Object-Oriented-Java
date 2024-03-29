import java.util.Locale;
import java.util.Scanner;

import entites.Triangle;

public class App {
    public static void main(String[] args) {
       
     
    Locale.setDefault(Locale.US);
    try (Scanner sc = new Scanner(System.in)) {
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Escreva as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Escreva as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
            
        
        double areaX = x.area();
        
        double areaY = y.area();
        
        System.out.printf("Triangle X area: %.2f\n" , areaX);
        System.out.printf("Triangle y area: %.2f\n" , areaY);

        if ( areaX > areaY){
            System.out.println("Large area: X ");
        }else{
            System.out.println("Large area: Y");
        }
        sc.close();
    }

    } 
}
