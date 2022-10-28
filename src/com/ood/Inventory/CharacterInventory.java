package com.ood.Inventory;

import com.ood.Item.IItem;

import java.util.ArrayList;
import java.util.List;

/**
 * heros/monsters' Inventory
 */
public class CharacterInventory implements IInventory<IItem>{
    private List<IItem> items;

    public CharacterInventory() {
        this.items = new ArrayList<>();
    }

    @Override
    public IItem consume() {
        return null;
    }

    @Override
    public void remove(IItem item) {
        items.remove(item);
    }

    @Override
    public void Add(IItem item) {
        items.add(item);
    }
}
