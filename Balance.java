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
        Balance b1 = new Balance();
        System.out.println(b1);
        
    }

    @Override
    public String toString() {
        return "";
    }

    public Balance(){

        bankBalance = 150.00;
        System.out.println(bankBalance);
        moneyINeed();

    }

    public Scanner userInput(){
        reader = new Scanner(System.in);
        return reader;
    }

    public void bankBalance(){

        /*
         * 
         * TODO:
         * -decreasing bankBalance after a week (bankBalance - spentWeek)
         * -setting bankBalance to 150.00 after a month
         * 
         */

        bankBalance = 150.00;
        System.out.println(bankBalance);
    }


    public void moneyINeed(){
            String object;
            double price;
            //boolean canIBuy;



            System.out.println("What do u wanna buy?");
            object = userInput().nextLine();
            System.out.println("You wanna buy: "+ object+ ".\n");

            System.out.println("How much does it cost? ");
            price = userInput().nextDouble();
            System.out.println(object + " costs "+ price+ ".\n");


            if (price <= bankBalance){
                System.out.println("You can buy it");
            }
            else{
                moneyNeeded = price - bankBalance;
                System.out.println("You need "+moneyNeeded+"EUR.");
            }

            



    }
    

 }