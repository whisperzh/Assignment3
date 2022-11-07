package com.ood.Team;

import java.util.ArrayList;
import java.util.List;

public abstract class SimpleCollection<T> {

    private List<T> itemList;

    public SimpleCollection() {
        this.itemList = new ArrayList<>();
        //need to set team size and add teams into teamCollection Now
    }

    public T getItemAt(int index){
        return itemList.get(index);
    }

    public void addItem(T t) {
        itemList.add(t);
    }

    public List<T> getItemList() {
        return itemList;
    }

    public void setItemList(List<T> itemList) {
        this.itemList = itemList;
    }

    public int size(){
        return itemList.size();
    }

}
