package com.ood.Views;

import java.util.Scanner;

/**
 * Universal visual module, can be used in any of my program
 */
public abstract class View implements VisualModule{
    private Scanner scanner;

    @Override
    public Scanner getScanner() {
        if(scanner==null)
            scanner=new Scanner(System.in);
        return scanner;
    }

    @Override
    public String jin_Str() {
        while (!getScanner().hasNext())
        {
            displayInvalidInputMessage();
            getScanner().next(); // remove and ignore next token
        }

        String str=getScanner().next();
        inputReprint(str);
        return str;
    }

    public String jin_Str(String messagetoUser) {
        jout(messagetoUser);
        String str=getScanner().nextLine();
        inputReprint(str);
        return str;
    }

    @Override
    public int jin_Int() {
        while (!getScanner().hasNextInt())
        {
            displayInvalidInputMessage();
            getScanner().next(); // remove and ignore next token
        }
        int userInput=getScanner().nextInt();
        inputReprint(Integer.toString(userInput));
        return userInput;
    }

    public int jin_Int(String messagetoUser) {
        jout(messagetoUser);
        return jin_Int();
    }

    public int jin_BorderedInt(int lowerBound,int upperBound){
        int pc=jin_Int("Please input a number between [ "+lowerBound+ " ~ "+upperBound +"] ");
        while(pc>=1&&pc<=3)
        {
            displayInvalidInputMessage();
            pc=jin_Int("Please input a number between [ "+lowerBound+ " ~ "+upperBound +"] ");
        }
        return pc;
    }

    @Override
    public double jin_double() {
        while (!getScanner().hasNextDouble())
        {
            displayInvalidInputMessage();
            getScanner().next(); // remove and ignore next token
        }
        double userInput=getScanner().nextDouble();
        inputReprint(Double.toString(userInput));
        return userInput;
    }

    public double jin_double(String messagetoUser) {
        jout(messagetoUser);
        return jin_double();
    }

    @Override
    public void inputReprint(String userInput) {
        jout("your input: "+userInput);
    }

    public void displayWelcomeMessage(){
        joutDivider();
        jout("--------------WELCOME--------------");
        joutDivider();
    }

    public void displayGoodByeMessage(){
        joutDivider();
        jout("-------------------------BYE-------------------------");}

    public void displayInvalidInputMessage(){
        jout("Your Input is Invalid Please Input Again!");
    }

    public void displayInvalidInputMessage(String message){
        jout(message);
    }
}
