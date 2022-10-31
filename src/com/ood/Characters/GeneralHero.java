package com.ood.Characters;

import com.ood.AttributesItems.Wallet;
import com.ood.Enums.HeroEnum;
import com.ood.Inventory.IInventory;
import com.ood.Item.IItem;

/**
 * an abstract hero
 */
public abstract class GeneralHero implements ICharacter{
    private String name;
    private float experience;
    private float HP;
    private float MP;
    private float strength;
    private int level;
    private float dexterity;
    private float defense;
    private float agility;
    private Wallet myWallet;
    private IInventory inventory;

    public HeroEnum getType() {
        return type;
    }

    public void setType(HeroEnum type) {
        this.type = type;
    }

    private HeroEnum type;

    @Override
    public void levelUp() {
        MP*=1.1;
        level++;
    }

    @Override
    public float getDamageVal() {
        return strength;
    }

    @Override
    public float getStrength() {
        return strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
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

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public float getHP() {
        return HP;
    }

    @Override
    public void setHP(float HP) {
        this.HP = HP;
    }

    public float getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public float getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public float getAgility() {
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

    @Override
    public float getDefense() {
        return defense;
    }

    @Override
    public void setDefense(float defense) {
        this.defense=defense;
    }

    @Override
    public void refillHP(){
        float targetVal=getLevel()*100;
        setHP(Math.max(targetVal,getHP()));
    }

    abstract void attack();

    abstract void faint();

}
