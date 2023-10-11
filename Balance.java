/*
 * ~~~Balance/Savings tracker~~~
 * Author: Hanna Cieslik
 * Version: 0.1.0
 * 
 * TODO:
 * -current bank balance
 * -Money I spent in a month
 * -Money I saved in a month
 * -Money I spent in a week
 * -Money I saved in a week
 * 
 * Money I need to save up for something
 */

 import java.util.Scanner;

 public class Balance{

    private double bankBalance;
    private double spentMonth;
    private double spentWeek;
    private double savedMonth;
    private double savedWeek;
    private double moneyNeeded;
    Scanner reader;

    public static void main(String[] args){

        System.out.println("Hello World");
        //balance b1 = new balance();
        //System.out.println(b1);
        
    }

    public Balance(){



    }

    public Scanner userInput(){
        reader = new Scanner(System.in);
        return reader;
    }

    public void bankBalance(){

        bankBalance = 150.00;
        System.out.println(bankBalance);
        moneyINeed();
    }


    public void moneyINeed(){
            String object;
            double price;
            boolean canIBuy;
            String input1;
            double input2;



            System.out.println("What do u wanna buy?");
            input1 = userInput().nextLine();
            System.out.println("You wanna buy: "+ input1+ ".");

            



    }
    

 }