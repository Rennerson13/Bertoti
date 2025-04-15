package com.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class AlertaEmergencia {
    private List<OuvinteAlerta> ouvintes = new ArrayList<>();

    public void adicionarOuvinte(OuvinteAlerta ouvinte) {
        ouvintes.add(ouvinte);
    }

    public void removerOuvinte(OuvinteAlerta ouvinte) {
        ouvintes.remove(ouvinte);
    }

    public void emitirAlerta(String alerta) {
        for (OuvinteAlerta ouvinte : ouvintes) {
            ouvinte.receberAlerta(alerta);
        }
    }
}
