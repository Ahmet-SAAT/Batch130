package proje.Cesitli;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Random generator=new Random();
        int dice1;
        int dice2;
        int opponentDice1;
        int opponentDice2;

        int myVictories=0;
        int opponentVictories=0;
        while (true){

            System.out.println("Do you want to play?Your score : "+myVictories+"/ Opponent score : "+opponentVictories+ "(type 'yes' or 'no' ");
            String answer=input.nextLine();
            if (answer.equals("yes")){

                dice1=generator.nextInt(6)+1;
                dice2=generator.nextInt(6)+1;
                opponentDice1=generator.nextInt(6)+1;
                opponentDice2=generator.nextInt(6)+1;

                System.out.println("Your dice: "+dice1+" : "+dice2);
                System.out.println("Opponent dice: "+opponentDice1+" : "+opponentDice2);

                int myScore=dice1+dice2;
                int opponentScore=opponentDice1+opponentDice2;

                if (myScore>opponentScore){
                    System.out.println("You won");
                    myVictories++;
                } else if (opponentScore>myScore) {
                    System.out.println("The computer won");
                    opponentVictories++;
                }else {
                    System.out.println("IT is a draw");
                }
                if (myVictories==6){
                    System.out.println("You won");
                    break;
                }
                if (opponentVictories==6){
                    System.out.println("The computer won");
                    break;
                }
            } else if (answer.equals("no")) {
                System.out.println("See you next time");
                break;

            }else {
                System.out.println("You did not enter a valid answer");
            }
        }



    }
}
