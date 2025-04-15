package com.example.Strategy;

public class Pix implements MetodoPagamento {
    @Override
    public double calcularValor(double valorBruto) {
        return valorBruto * 0.97;
    }
}
