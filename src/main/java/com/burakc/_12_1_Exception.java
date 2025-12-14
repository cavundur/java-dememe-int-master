package com.burakc;

import java.io.IOException;

class burakc extends RuntimeException{
    private String message;

    public burakc(String message) {
        super(message);
    }
}


//
public class _12_1_Exception {


    public static void count() throws ArithmeticException, IOException,ClassNotFoundException {
        int sayi = 10;

        try {
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) { // en genel: Exception
            //e.printStackTrace();
            //throw new ArithmeticException("Burada sayıyı sıfıra nasıl bölersin");
            // Customise Exception
            throw new burakc("Özel exception: Burada sayıyı sıfıra nasıl bölersin");
        } finally {
            System.out.println("database.close()");
            System.out.println("socket.close()");
            System.out.println("scanner.close()");
        }

        System.out.println("son satır");
    }


    // PSVM
    static void main () throws IOException, ClassNotFoundException {
        count();
    }
}