package org.designpatterns.strategy;

public class Item {

    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public Item (String id,int price)
    {
        this.id=id;
        this.price =price;
    }
    
       public String toString() {
        // TODO Auto-generated method stub
        return  "id ==" +id +" and price ==" +price; 
    }
}
