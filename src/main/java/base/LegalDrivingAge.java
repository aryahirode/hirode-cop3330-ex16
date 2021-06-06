/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class LegalDrivingAge {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        LegalDrivingAge myApp = new LegalDrivingAge();
        myApp.output();
    }

    private int agePrompt() {
        System.out.print("What is your age? ");
        return Integer.parseInt(in.nextLine());
    }

    private void output() {
        String str = agePrompt() < 16 ? "You are not old enough to legally drive." : "You are old enough to legally drive.";
        System.out.println(str);
    }
}
