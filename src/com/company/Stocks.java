package com.company;

public class Stocks<N extends Number> implements Printable {

    N stock;

    public Stocks(N stock) {
        this.stock = stock;
    }

    public N getStock() {
        return stock;
    }


    @Override
    public void printPrice() {
        System.out.println(stock);
    }
}
