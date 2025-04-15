package com.example.Observer;

public class Radio implements OuvinteAlerta {
    @Override
    public void receberAlerta(String alerta) {
        System.out.println("[RÁDIO] ⚠️ Alerta de emergência: " + alerta);
    }
}