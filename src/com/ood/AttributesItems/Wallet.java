package com.ood.AttributesItems;

/**
 * a standard wallet
 */
public class Wallet {

    private int amount;

    public Wallet() {
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean pay(int price){
        if(price<=amount)
        {
            amount-=price;
            return true;
        }
        return false;
    }
    public void get(int amt){
        amount+=amt;
    }
}
