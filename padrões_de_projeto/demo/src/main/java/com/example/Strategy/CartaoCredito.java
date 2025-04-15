package com.example.Strategy;

public class CartaoCredito implements MetodoPagamento {
    @Override
    public double calcularValor(double valorBruto) {
        return valorBruto * 1.05;
    }
}
