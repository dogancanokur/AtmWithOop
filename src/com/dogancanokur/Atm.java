package com.dogancanokur;

import java.util.Scanner;

public class Atm {
    Login login = new Login();

    Customer customer = new Customer(1, "Doğancan Okur", 1500, "dogancan");
//    Customer customerTwo = new Customer(2, "Kübra Okur", 2500, "kubra");

    Scanner scanner = new Scanner(System.in);

    private double balanceOfAtm;

    public Atm() {
        System.out.println("...Booting of ATM...\nWelcome to the our great bank.");

        System.out.println("Enter the username");
        String username = scanner.nextLine();
        System.out.println("Enter the password");
        String userPass = scanner.nextLine();

        if (login.loginCheck(customer.getUsername(), username, userPass)) {
            signedIn();
        } else {
            System.out.println("Your attempt is failed\nPlease try again.");
        }

    }

    public void signedIn() {

        int choice = 9;

        while (choice != 0) {
            showMenu();
            choice = selectMenu();

            switch (choice) {
                case 1:
                    withdrawalMoney();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    showMoney();
                    break;
                case 0:
                    quit();
                    break;
            }
        }
    }


    private void showMoney() {
        System.out.println("************************\n" +
                "Your balance : " + customer.getBalance() +
                "\n************************");
    }

    private Customer withdrawalMoney() {
        System.out.println("Enter the amount you to want to withdraw");
        double amount = scanner.nextDouble();
        if (customer.getBalance() >= amount) {
            customer.setBalance(customer.getBalance() - amount);
            System.out.println("************************\n" +
                    "You have been processed." +
                    "\n************************");
        } else {
            System.out.println("Your balance is insufficent");
        }
        return customer;
    }

    public Customer depositMoney() {
        System.out.println("Enter the amount you to want to deposit");
        double amount = scanner.nextDouble();
        customer.setBalance(customer.getBalance() + amount);
        return customer;
    }

    private void quit() {
        System.out.println("Good Bye.");
        System.exit(0);
    }


    private int selectMenu() {
        int choice = scanner.nextInt();

        return choice;

    }

    public void showMenu() {
        String menu = "Press 1 to withdraw money\n" +
                "Press 2 to deposit money\n" +
                "Press 3 for show your current money status\n" +
                "Press 0 to quit the Atm";
        System.out.println(menu);
    }

}
