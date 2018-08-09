package org.designpatterns.strategy;

public class ShoppingCartTest {
    public static void main(String[] args) {
        Item item1 =new Item("12",10);
        Item item2 =new Item("13",100);
        
        ShoppingCart cart=new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.removeItem(item1);
        cart.dispayCart();
        cart.calculateTotal();
        System.out.println(cart.getTotal());
        cart.pay(new PaypalStrategy("pravinherester@paypal.com", "welcome98"));
        cart.pay(new CreditCardStrategy("pravin","124531","912","2018"));
    }

}
