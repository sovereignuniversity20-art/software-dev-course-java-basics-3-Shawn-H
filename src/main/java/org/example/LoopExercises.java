package org.example;

public class LoopExercises {
    public int sum(int n) {
        int num = 0;
        for (int i = 1; i <=n; i++) {
            num = num +i;
        }
        return num;
    }

    public int sumUntilEven(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)
        int num = 0;
        int i = 1;
        num = num +i;
        i++;
        while (num%2 != 0 && i <=n) {
            num = num +i;
            i++;
        }
        return num;
    }
}
