package JAVA2.LAB2;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 interger value: ");
        n = scanner.nextInt();

        int[] arr =new int[n];
        double total = 0;

        for(int i =0; i<5; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i=0 ; i<5; i++){
            System.out.println("Element "+ i + ", typed value was "+ arr[i]);
        }

        for(int i=0; i<5;i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("Avarage Temperture is  : %.2f ", average);
    }
}
