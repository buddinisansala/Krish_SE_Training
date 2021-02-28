package com.buddhi.designpattern.momento;

public class Application {
    public static void main(String[] args) {
        CartHistory cartHistory = new CartHistory();
        Cart cart = new Cart();

        cart.addItem(new Item("Casual Linen Frock"));
        cart.addItem(new Item("White T-Shirt"));
        cartHistory.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("Red Midi Dress "));
        cartHistory.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("Hand Bang"));
        //cartHistory.save(cart);
        //System.out.println(cart);

        cartHistory.revert(cart);
        System.out.println(cart);

        cart.addItem(new Item("Balck Shoe"));
        //cartHistory.save(cart);
        System.out.println(cart);

        cartHistory.revert(cart);
        System.out.println(cart);
    }
}
