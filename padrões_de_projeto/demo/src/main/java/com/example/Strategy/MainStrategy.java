package com.example.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();
        double valorCompra = 100.0;

        processador.setMetodoPagamento(new CartaoCredito());
        System.out.println("Valor com cartão: R$" + processador.processarPagamento(valorCompra));

        processador.setMetodoPagamento(new Pix());
        System.out.println("Valor com Pix: R$" + processador.processarPagamento(valorCompra));
    }
}
