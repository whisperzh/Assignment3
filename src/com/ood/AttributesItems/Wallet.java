package com.ood.AttributesItems;

/**
 * a standard wallet
 */
public class Wallet {

    private float amount;

    public Wallet() {
        this.amount = 0;
    }

    public Wallet(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean pay(float price){
        if(price<=amount)
        {
            amount-=price;
            return true;
        }
        return false;
    }
    public void get(float amt){
        amount+=amt;
    }
}
