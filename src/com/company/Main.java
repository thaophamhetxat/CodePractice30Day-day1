package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int even; //chẵn
        int odd;  //lẻ

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số vào mảng:");
            n = scanner.nextInt();
        } while (n < 0);

        int A[] = new int[n];
        int Even[] = new int[n];
        int Odd[] = new int[n];

        System.out.println("Nhập mảng cho các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }

        even = odd = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                Even[even] = A[i];
                even++;
            } else {
                Odd[odd] = A[i];
                odd++;
            }
        }

        System.out.println("các phần tử trong mảng chẵn là:");
        for (int i = 0; i < even; i++) {
            System.out.println(Even[i]);
        }

        System.out.println("các phần tử trong mảng lẻ là:");
        for (int i = 0; i < odd; i++) {
            System.out.println(Odd[i]);
        }
    }
}
