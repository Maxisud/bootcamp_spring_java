package org.example.sesipertama;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==3){
                break;
            }
            // System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i==3 || i == 7 || i == 2){
                continue;
            }
            System.out.println(i);
        }
    }
}
