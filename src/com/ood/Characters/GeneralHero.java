package com.ood.Characters;

import com.ood.AttributesItems.Wallet;
import com.ood.Inventory.IInventory;
import com.ood.Item.IItem;

/**
 * an abstract hero
 */
public abstract class GeneralHero implements ICharacter{
    private String name;
    private int experience;
    private int HP;
    private int MP;
    private int strength;
    private int level;
    private int dexterity;
    private int agility;
    private Wallet myWallet;
    private IInventory inventory;

    @Override
    public void levelUp() {
        level++;
    }

    @Override
    public int getDamageVal() {
        return strength;
    }

    @Override
    public void setDamageVal(int damageVal) {
        strength=damageVal;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void getExp(int val)
    {
        experience+=val;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public Wallet getMyWallet() {
        return myWallet;
    }

    public void setMyWallet(Wallet myWallet) {
        this.myWallet = myWallet;
    }

    public IInventory getInventory() {
        return inventory;
    }

    public void setInventory(IInventory inventory) {
        this.inventory = inventory;
    }

    public void buyItem(IItem item){
        int price=item.getPrice();
        boolean transactionSuccess = getMyWallet().pay(price);
        if(transactionSuccess)
        {
            getInventory().Add(item);
        }
    }

    /**
     * trade an item in Inventory, increase money in wallet
     */
    public void tradeItem()
    {

    }

    abstract void attack();

    abstract void faint();

}
