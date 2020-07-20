package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean run = true;
        System.out.println("enter any mathematical expression to evaluate (javascript Notation)");
        while(run) {
            String exp = scanner.nextLine();
            if("exit" .equalsIgnoreCase(exp)) {
                System.out.println("Bye Bye");
                run = false;
                scanner.close();
                continue;
            }
            System.out.println("result:  " +calculator.expressionEval(exp));
            System.out.println("try another Exception(type exit to close): ");
        }


    }
}
