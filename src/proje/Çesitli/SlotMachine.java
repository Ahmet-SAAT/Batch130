package proje.Çesitli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    static Scanner input=new Scanner(System.in);
    static Random generator=new Random();
    static double budget=100;
    static ArrayList<String> possibilities=new ArrayList<>(Arrays.asList("DIAMOND","CHERRY","BAR"));

    public static void main(String[] args) {

        System.out.println("Do you want to start game?(type 'yes' or 'no')");
        String response=input.nextLine();
        if (response.equals("yes")){
            startGame();
        } else if (response.equals("no")) {

            System.out.println("See you next time");
        }else {
            System.out.println("That is not a valid answer");
        }
    }

    private static void startGame() {
        while (true) {
            System.out.println("Enter the stake(Your Budget : " + budget + ") :");
            double stake = input.nextDouble();
            if (stake > budget) {
                System.out.println("You dont have that kind of money!");
            } else {
                budget-=stake;
                System.out.println("I pulled the lever");
                String result1= getRandomValue();
                String result2= getRandomValue();
                String result3= getRandomValue();
                printTheResults(result1, result2, result3);
                if (result1.equals(result2 )&& result2.equals(result3)){
                    System.out.println("JACKPOT!!!");
                    double plus=(30.0/100)*stake;
                    budget+=(stake+plus);
                } else if (result1.equals(result2 )|| result2.equals(result3) || result1.equals(result3)) {
                    System.out.println("SEMI JACKPOT!!!");
                    double plus=(10.0/100)*stake;
                    budget+=(plus+stake);
                }else {
                    System.out.println("You Lost");
                }
                if (budget>1000){
                    System.out.println("You Won The Game");
                    break;
                }
                if (budget<1){
                    System.out.println("You LostThe Game");
                    break;
                }
            }
        }
    }

    private static String getRandomValue() {
        return possibilities.get(generator.nextInt(possibilities.size()));
    }

    private static void printTheResults(String result1, String result2, String result3) {
        System.out.printf("[%s]  [%S]  [%s]", result1, result2, result3);
    }
}
