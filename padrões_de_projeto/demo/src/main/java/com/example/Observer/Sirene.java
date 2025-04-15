package com.example.Observer;

public class Sirene implements OuvinteAlerta {
    @Override
    public void receberAlerta(String alerta) {
        System.out.println("[SIRENE] 🚨 SOANDO ALERTA: " + alerta.toUpperCase());
    }
}