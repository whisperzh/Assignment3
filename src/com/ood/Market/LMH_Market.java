package com.ood.Market;

import com.ood.AttributesItems.LMH_Constant;
import com.ood.AttributesItems.Wallet;
import com.ood.Characters.GeneralHero;
import com.ood.Enums.ItemEnum;
import com.ood.Enums.ViewEnum;
import com.ood.Factories.ViewFactory;
import com.ood.Inventory.IInventory;
import com.ood.Inventory.MarketInventory;
import com.ood.Item.IItem;
import com.ood.Util.AttributeParser;
import com.ood.Util.IConfigParser;
import com.ood.Util.ItemParser;
import com.ood.Util.ParseCollection;
import com.ood.Views.MarketView;

import java.util.List;

/**
 * The concrete class for LMH game only.
 */
public class LMH_Market implements IMarket<IItem> {

    private IInventory<IItem> marketInventory;

    private MarketView marketView;

    private Wallet myWallet;

    private IConfigParser parser;

    public LMH_Market() {
        marketView= ViewFactory.createView(ViewEnum.MARKET);
        parser=new ItemParser(LMH_Constant.ARMORY_Path, ItemEnum.ARMORY);
        marketInventory=new MarketInventory(parser);
        myWallet=new Wallet(LMH_Constant.SHOP_DEFAULT_GOLD);
    }

    @Override
    public void removeItem(IItem item) {
        marketInventory.remove(item);
    }

    @Override
    public void setInventory(IInventory<IItem> inventory) {
        this.marketInventory=inventory;
    }

    @Override
    public IInventory getInventory() {
        return marketInventory;
    }

    @Override
    public void trade(IItem item) {//
    }

    @Override
    public MarketView getView() {
        return marketView;
    }

    @Override
    public void enterMarket(GeneralHero hero) {
        List<List<String>> info=((ItemParser)parser).getItems();
        marketView.showMenu(info);
        chooseActionAndDo();
    }

    @Override
    public void chooseActionAndDo() {
        char action=getView().collectPlayersAction(LMH_Constant.VALID_ACTIONS_INMARKET,LMH_Constant.ACTION_HELP_INMARKET);
        switch (action)
        {
            case 'B'|'b'://buy
                int itemIndex=marketView.collectCustomersChoice(marketInventory.getSize()-1);
                break;
            case 'S'|'s'://sell
                break;
            case 'V'|'v'://view
                List<List<String>> info=((ItemParser)parser).getItems();
                marketView.showMenu(info);
                break;
            case 'Q'|'q'://quit
                marketView.displayGoodByeMessage();
                System.exit(0);
                break;
            case 'E'|'e'://exit market
                //we do nothing here
                break;
        }
    }

}
