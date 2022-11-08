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
import com.ood.Judge.IGameJudge;
import com.ood.Judge.LMH_Judge;
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

    private ParseCollection parseCollection;

    private GeneralHero customer;

    public LMH_Market() {
        marketView= ViewFactory.createView(ViewEnum.MARKET);
        initParserCollection();
        marketInventory=new MarketInventory();
        marketInventory.addParserCollection(parseCollection);
        myWallet=new Wallet(LMH_Constant.SHOP_DEFAULT_GOLD);
    }

    private void initParserCollection(){
        parseCollection=new ParseCollection(false);

        parseCollection.AddParser(new ItemParser(LMH_Constant.ARMORY_Path, ItemEnum.ARMORY));
        parseCollection.AddParser(new ItemParser(LMH_Constant.WEAPONRY_Path, ItemEnum.WEAPONRY));
        parseCollection.AddParser(new ItemParser(LMH_Constant.POTIONS_Path, ItemEnum.POTIONS));

//        parseCollection.AddParser(new ItemParser(LMH_Constant.FIRESPELL_Path,ItemEnum.FIRE_SPELL));
//        parseCollection.AddParser(new ItemParser(LMH_Constant.ICESPELL_Path,ItemEnum.ICE_SPELL));
//        parseCollection.AddParser(new ItemParser(LMH_Constant.LIGHTNINGSPELL_Path,ItemEnum.LIGHTENING_SPELL));

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
        customer=hero;
        showMenu();
        marketView.displayMarketWelcomeMessage(hero.getName());
        chooseActionAndDo();
    }

    @Override
    public void chooseActionAndDo() {
        char action=getView().collectPlayersAction(LMH_Constant.VALID_ACTIONS_INMARKET,LMH_Constant.ACTION_HELP_INMARKET);
        switch (action)
        {
            case 'B'|'b'://buy
                int itemIndex=marketView.collectCustomersChoice(marketInventory.getSize()-1);
                IItem checkoutItem = marketInventory.get(itemIndex);
                if(getJudge().transancationValid(customer,checkoutItem)) {
                    customer.buyItem(checkoutItem);
                    marketInventory.remove(checkoutItem);
                    marketView.disPlayCheckoutInfo(customer,checkoutItem);
                }else
                {
                    marketView.disPlayCannotBuyInfo();
                    chooseActionAndDo();
                }
                break;
            case 'S'|'s'://sell
                int customerInvSize=customer.getInventory().getSize();
                if(customerInvSize==0) {
                    marketView.disPlayCannotSellInfo();
                    chooseActionAndDo();
                }else {
                    marketView.displayCharacterInventory(customer);
                    int sellItemIndex = marketView.collectCustomersChoice(customerInvSize-1);
                    IItem tobeSoldItem = customer.getInventory().get(sellItemIndex);
                    marketInventory.add(tobeSoldItem);
                    customer.getInventory().remove(tobeSoldItem);
                    customer.getMyWallet().gain(tobeSoldItem.getSellPrice());
                    marketView.displayCharacterInventory(customer);
                }
                break;
            case 'Q'|'q'://quit
                marketView.displayGoodByeMessage();
                System.exit(0);
                break;
            case 'E'|'e'://exit market
                customer=null;
                //we do nothing here
                break;
        }
    }
    private void showMenu(){
        List<List<List<String>>> info=parseCollection.getAllItemsWithTitle();
        marketView.showMenu(info);
    }

    private IGameJudge getJudge(){
        IGameJudge judge=new LMH_Judge();
        return judge;
    }

}
