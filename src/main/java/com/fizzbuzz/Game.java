package com.fizzbuzz;

import java.util.ArrayList;

public class Game {
    private int gameSize = 0;

    public Game(int gameSize) {
        this.gameSize = gameSize;
    }

    public ArrayList<String> printFizzBuzz() {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 1; i <= this.gameSize; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else {
                output.add(String.valueOf(i));
            }
        }
        return output;
    }
}
