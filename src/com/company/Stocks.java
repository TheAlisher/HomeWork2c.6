package com.company;

public class Stocks<N extends Number> implements Numbers {

    N stock;

    public Stocks(N stock) {
        this.stock = stock;
    }

    public N getStock() {
        return stock;
    }

}
