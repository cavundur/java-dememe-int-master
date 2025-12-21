package com.burakc.tutorial;

import java.util.Scanner;

public class _6_Scanner {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name, surname;

        System.out.print("\nLütfen Adınızı Giriniz: ");
        name=scanner.nextLine();

        System.out.print("Lütfen Soyadınızı Giriniz: ");
        surname=scanner.nextLine();

        System.out.println("Adınız ve Soyadınız: "+(name+" "+surname));
    }
}
