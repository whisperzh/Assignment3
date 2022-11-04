package com.ood.Characters;

import com.ood.AttributesItems.Vector2;
import com.ood.AttributesItems.Wallet;
import com.ood.Enums.HeroEnum;
import com.ood.Inventory.IInventory;
import com.ood.Item.IItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private Vector2 currentPosition;
    private float agility;
    private String icon;
    private Wallet myWallet;
    private IInventory<IItem> inventory;



    public HeroEnum getType() {
        return type;
    }

    public void setType(HeroEnum type) {
        this.type = type;
    }

    private HeroEnum type;

    public GeneralHero(List<String> attributes) {
        name=attributes.get(0);
        MP=Float.valueOf(attributes.get(1));
        strength=Float.valueOf(attributes.get(2));
        agility=Float.valueOf(attributes.get(3));
        dexterity=Float.valueOf(attributes.get(4));
        myWallet=new Wallet();
        myWallet.setAmount(Float.valueOf(attributes.get(5)));
        experience=Float.valueOf(attributes.get(6));
    }

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

    public void setCurrentPosition(Vector2 currentPosition) {
        this.currentPosition = currentPosition;
    }

    public IInventory getInventory() {
        return inventory;
    }

    public void setInventory(IInventory inventory) {
        this.inventory = inventory;
    }

    public void buyItem(IItem item){
        float price=item.getOriginalPrice();
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

    public float getSpellDamage(float spellBaseDamage){
        return spellBaseDamage+spellBaseDamage*dexterity/10000f;
    }

    abstract void attack();

    abstract void faint();

    @Override
    public String getIcon() {
        return icon;
    }

    @Override
    public void setIcon(String icon) {
        this.icon=icon;
    }

    @Override
    public boolean isObstacle() {
        return false;
    }

    @Override
    public boolean isMarket() {
        return false;
    }

    @Override
    public void move(int row, int col) {
        currentPosition=new Vector2(row,col);
    }

    @Override
    public Vector2 getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public Map<String, String> getAllAttribute() {
        Map<String ,String > ans=new HashMap<>();
        ans.put("level",Integer.toString(getLevel()));
        ans.put("hp",String.format("%.2f",getHP()));
        ans.put("mana",String.format("%.2f",getMP()));
        ans.put("experience",String.format("%.2f",getExperience()));
        ans.put("money",String.format("%.2f",myWallet.getAmount()));
        ans.put("skill_level","");
        return ans;
    }

}
