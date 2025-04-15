package com.example.Strategy;

public class ProcessadorPagamento {
    private MetodoPagamento metodo;

    public void setMetodoPagamento(MetodoPagamento metodo) {
        this.metodo = metodo;
    }

    public double processarPagamento(double valor) {
        if (metodo == null) {
            throw new IllegalStateException("Método de pagamento não definido!");
        }
        return metodo.calcularValor(valor);
    }
}
