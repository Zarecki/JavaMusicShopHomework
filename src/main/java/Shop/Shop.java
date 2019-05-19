package Shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<StockItem> stock;
    private ArrayList<StockItem> percussionStock;
    private ArrayList<StockItem> woodwindStock;
    private ArrayList<StockItem> keyedStock;
    private ArrayList<StockItem> stringedStock;
    private ArrayList<StockItem> brassStock;

    public Shop() {
        this.stock = new ArrayList<>();
        this.percussionStock = new ArrayList<>();
        this.woodwindStock = new ArrayList<>();
        this.keyedStock = new ArrayList<>();
        this.stringedStock = new ArrayList<>();
        this.brassStock = new ArrayList<>();
    }

    public int getStock() {
        return stock.size();
    }

    public int getPercussionStock() {
        return percussionStock.size();
    }

    public int getWoodwindStock() {
        return woodwindStock.size();
    }

    public int getKeyedStock() {
        return keyedStock.size();
    }

    public int getStringedStock() {
        return stringedStock.size();
    }

    public int getBrassStock() {
        return brassStock.size();
    }

    public void addItemToStock(StockItem stockItem){
        this.stock.add(stockItem);
    }

    public void removeItemFromStock(StockItem stockItemToBeRemoved){
        int index = this.stock.indexOf(stockItemToBeRemoved);
        this.stock.remove(index);
    }

    public void populateStockLists(){
        populatePercussion();
        populateWoodwind();
        populateKeyed();
        populateStringed();
        populateBrass();
    }

    public void populatePercussion(){
        for (StockItem stockitem: this.stock) {
            if (stockitem.getInstrument().getType().equals("Percussion"))
                this.percussionStock.add(stockitem);
        }
    }

    public void populateWoodwind(){
        for (StockItem stockitem: this.stock) {
            if (stockitem.getInstrument().getType().equals("Woodwind"))
                this.woodwindStock.add(stockitem);
        }
    }

    public void populateKeyed(){
        for (StockItem stockitem: this.stock) {
            if (stockitem.getInstrument().getType().equals("Keyed"))
                this.keyedStock.add(stockitem);
        }
    }

    public void populateStringed(){
        for (StockItem stockitem: this.stock) {
            if (stockitem.getInstrument().getType().equals("Stringed"))
                this.stringedStock.add(stockitem);
        }
    }

    public void populateBrass(){
        for (StockItem stockitem: this.stock) {
            if (stockitem.getInstrument().getType().equals("Brass"))
                this.brassStock.add(stockitem);
        }
    }

    public double calculateTotalProfit(){
        double totalProfit = 0;
        for (StockItem stockitem : this.stock) {
            totalProfit += stockitem.getMarkup();
        }
        return totalProfit;
    }
}
