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

import java.util.Calendar;
import java.util.Scanner;

 public class Balance{

    private double bankBalance;
    private double spentMonth;
    private double spentWeek;
    private double savedMonth;
    private double savedWeek;
    private double moneyNeeded;
    private Scanner reader;

    public static void main(String[] args){

        System.out.println("~~~Balance tracker~~~");
        System.out.println("What do you wanna do? [H]elp | [M]onth balance");
        Balance b1 = new Balance();

        /*
         * 
         * FIX OF CANNOT MAKE A STATIC REFERENCE TO A NON-STATIC METHOD:
         * 
         * just make an instance of the class an call the non-static method that way
         */

        b1.switchMenu();
        
    }

    @Override
    public String toString() {
        return "";
    }

    public void switchMenu(){


        Scanner hauptScanner = new Scanner(System.in);
        switch (hauptScanner.next().toLowerCase()){

            case "H":
                helpMenu();   
                break;
            
            case "M":
                moneyInMonth();
                break;
        }

        hauptScanner.close();                        //if u don't close the scanner u'll get the rescource leak error
    }

    public Balance(){

        switchMenu();


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

            /*
             * 
             * ~~~POS extra lesson notes~~~
             * -&& = and
             * - 1 != 2 = 1 is not 2
             * 
             */


            System.out.println("What do u wanna buy?");
            object = userInput().nextLine();
            System.out.println("You wanna buy: "+ object+ ".\n");

            System.out.println("How much does it cost? ");
            price = userInput().nextDouble();
            System.out.println(object + " costs "+ price+ ".\n");


            if (price <= bankBalance){
                System.out.println("You can buy it");
                System.out.println("Your current bank balance is: "+(bankBalance - price)+" EUR.");
            }
            else{
                moneyNeeded = price - bankBalance;
                System.out.println("You need "+moneyNeeded+"EUR.");
            }
    }

    public void moneyInMonth(){
        //NOTE: in java.util.Date, January is the month 0!!! 
        //that means that: september = 8, october = 9, november = 10, december = 11 

        java.util.Date date= new java.util.Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);

        System.out.println(month);
    }

    public void helpMenu(){
        int version = 000101;

        System.out.println("Hello! Welcome to the Balance tracker help menu! How can I help ou today?");
        System.out.println("[V]ersion | [C]ommands");

        switch (userInput().nextLine().toLowerCase()){

            case "V":
                System.out.println("The current version of the program is: " + version);
                break;
        }
    }
    

 }