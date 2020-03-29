package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name=name;
        this.stock= new ArrayList<ISell>();
    }

//    getters
    public String getName() { return name; }
    public ArrayList<ISell> getStock() { return stock; }

//    setters
    public void setName(String name) { this.name = name; }
    public void setStock(ArrayList<ISell> stock) { this.stock = stock; }

//  add stock
    public void addToStock(ISell item){
        this.stock.add(item);
    }

//    total wholesale value
    public double getWholesaleTotal(){
        double total = 0;
        for(ISell item : this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }



}
