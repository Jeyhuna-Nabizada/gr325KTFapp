package ooppack1;

import java.util.Scanner;

public class OopClsTask6 {
    static int sumOfArray(int length){
        int newArray[] = new int[length];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the elements : ");
        int elements;

        for(int i=0; i<=newArray.length-1; i++){
            elements= scanner.nextInt();
            newArray[i]=elements;
            sum+=newArray[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter the length of the array : ");
        int length = newScanner.nextInt();

        int sum = sumOfArray(length);
        System.out.println(sum);
    }
}
