package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        SecondClass.userInput();

    }
}

 class SecondClass {
     public static String userInput() {
         Scanner scanner = new Scanner(System.in);

         int muchWater;
         int muchMilk;
         int muchBeans;
         int muchCups;

         int mlOfWater = 400;
         int mlOfMilk = 540;
         int grOfCoffeeBeans = 120;
         int cups = 9;
         int money = 550;

         System.out.println("Write action (buy, fill, take, remaining, exit):");

         while (scanner.hasNextLine()) {

             String input = scanner.next();

             switch (input) {

                 case "remaining":
                     System.out.println("The coffee machine has:");
                     System.out.println(mlOfWater + " ml of water");
                     System.out.println(mlOfMilk + " ml of milk");
                     System.out.println(grOfCoffeeBeans + " g of coffee beans");
                     System.out.println(cups + " disposable cups");
                     System.out.println("$" + money + " of money");
                     break;

                 case "buy":
                     System.out.println("What do you want to buy? 1 - espresso, 2 - latte or 3 - cappuccino, back - to main menu:");

                     String buyingCoffee = scanner.next();

                     switch (buyingCoffee) {

                         case "1":

                             if (mlOfWater >= 250 && grOfCoffeeBeans >= 16) {
                                 System.out.println("I have enough resources, making you a coffee!");
                                 mlOfWater -= 250;
                                 grOfCoffeeBeans -= 16;
                                 cups -= 1;
                                 money += 4;
                             } else if (mlOfWater < 250) {
                                 System.out.println("Sorry, not enough water!");
                             } else if (grOfCoffeeBeans < 16) {
                                 System.out.println("Sorry, not enough coffee beans!");
                             }
                             break;

                         case "2":

                             if (mlOfWater >= 350 && mlOfMilk >= 75 && grOfCoffeeBeans >= 20) {
                                 System.out.println("I have enough resources, making you a coffee!");
                                 mlOfWater -= 350;
                                 mlOfMilk -= 75;
                                 grOfCoffeeBeans -= 20;
                                 cups -= 1;
                                 money += 7;
                             } else if (mlOfWater < 350) {
                                 System.out.println("Sorry, not enough water!");
                             } else if (mlOfMilk < 75) {
                                 System.out.println("Sorry, not enough milk!");
                             } else if (grOfCoffeeBeans < 20) {
                                 System.out.println("Sorry, not enough coffee beans!");
                             }
                             break;

                         case "3":

                             if (mlOfWater >= 200 && mlOfWater >= 100 && grOfCoffeeBeans >= 12) {
                                 System.out.println("I have enough resources, making you a coffee!");
                                 mlOfWater -= 200;
                                 mlOfMilk -= 100;
                                 grOfCoffeeBeans -= 12;
                                 cups -= 1;
                                 money += 6;
                             } else if (mlOfWater < 200) {
                                 System.out.println("Sorry, not enough water!");
                             } else if (mlOfMilk < 100) {
                                 System.out.println("Sorry, not enough milk!");
                             } else if (grOfCoffeeBeans < 12) {
                                 System.out.println("Sorry, not enough coffee beans!");
                             }
                             break;

                         case "back":
                             break;

                     }
                     break;


                 case "fill":
                     System.out.println("Write how many ml of water you want to add?");
                     muchWater = scanner.nextInt();
                     mlOfWater += muchWater;
                     System.out.println("Write how many ml of milk you want to add?");
                     muchMilk = scanner.nextInt();
                     mlOfMilk += muchMilk;
                     System.out.println("Write how many grams of coffee beans you want to add?");
                     muchBeans = scanner.nextInt();
                     grOfCoffeeBeans += muchBeans;
                     System.out.println("Write how many disposable cups of coffee you want to add?");
                     muchCups = scanner.nextInt();
                     cups += muchCups;
                     break;

                 case "take":
                     System.out.println("I gave you $" + money);
                     money -= money;
                     break;


                 case "exit":
                     return null;
             }
         }
         return userInput();
     }
 }