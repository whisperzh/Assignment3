package com.ood.Views;

import java.util.Scanner;

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
        int num=getScanner().nextInt();
        inputReprint(Integer.toString(num));
        return num;
    }

    public int jin_Int(String messagetoUser) {
        jout(messagetoUser);
        int num=getScanner().nextInt();
        inputReprint(Integer.toString(num));
        return num;
    }

    @Override
    public double jin_double() {
        double num=getScanner().nextDouble();
        inputReprint(Double.toString(num));
        return num;
    }

    public double jin_double(String messagetoUser) {
        jout(messagetoUser);
        double num=getScanner().nextDouble();
        inputReprint(Double.toString(num));
        return num;
    }


    @Override
    public void inputReprint(String userInput) {
        jout(userInput);
    }

    public void displayWelcomeMessage(){
        jout("--------------WELCOME--------------");
    }

    public void displayGoodByeMessage(){jout("-------------------------BYE-------------------------");}
}
