package com.burakc.tutorial;

import com.burakc.SpecialColor;

public class _17_1_Thread extends Thread {
    @Override
    public void run() {
        System.out.println(SpecialColor.BLUE+"Thread Extends"+SpecialColor.RESET);
    }
}

class ThreadImplement implements Runnable {

    @Override
    public void run() {
        System.out.println(SpecialColor.YELLOW+"Thread Implement"+SpecialColor.RESET);
    }
}

class ThreadMainImplement {
    static void main() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(SpecialColor.PURPLE+"Thread Implement"+SpecialColor.RESET);
            }
        });
    }
}