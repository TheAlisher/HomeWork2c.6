package com.company;

public class Stocks<N extends Number> implements Printable<N> {

    N stock;

    public Stocks(N stock) {
        this.stock = stock;
    }

    public N getStock() {
        return stock;
    }


    @Override
    public N printPrice() {
        System.out.println(stock);
        return stock;
    }
}
