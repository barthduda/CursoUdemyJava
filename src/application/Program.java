package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle Y: ");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);


        sc.close();
    }
}
