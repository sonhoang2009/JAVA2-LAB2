package JAVA2.LAB2;

import java.util.Scanner;

public class BT13 {


    public static void main(String[] args) {

        System.out.print("How many day's temeratures ?: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Day "  + i + "'s high temp: ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("Avarage Temperture is  : %.2f ", average);
    }
}
