package com.thehecklers.sburrestdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thehecklers.sburrestdemo.model.AtleticoMineiro;

@Service
public class AtleticoMineiroService {
    private List<AtleticoMineiro> atleticoMineiroList = new ArrayList<>();

    public AtleticoMineiroService() {
        atleticoMineiroList.addAll(List.of(
                new AtleticoMineiro("Scarpa"),
                new AtleticoMineiro("Hulk"),
                new AtleticoMineiro("Vargas")
        ));
    }

    public List<AtleticoMineiro> getAllAtleticoMineiro() {
        return atleticoMineiroList;
    }

    public AtleticoMineiro getAtleticoMineiroById(String id) {
        for (AtleticoMineiro atleticoMineiro : atleticoMineiroList)
            if (atleticoMineiro.getId().equals(id))
                return atleticoMineiro;

        return null;
    }

    public AtleticoMineiro addAtleticoMineiro(AtleticoMineiro atleticoMineiro) {
        atleticoMineiroList.add(atleticoMineiro);

        return atleticoMineiro;
    }

    public AtleticoMineiro editAtleticoMineiro(String id, AtleticoMineiro editedAtleticoMineiro) {
        AtleticoMineiro atleticoMineiro = getAtleticoMineiroById(id);

        if (atleticoMineiro != null)
            atleticoMineiro.setName(editedAtleticoMineiro.getName());

        return atleticoMineiro;
    }

    public Boolean deleteAtleticoMineiro(String id) {
        AtleticoMineiro atleticoMineiro = getAtleticoMineiroById(id);

        if (atleticoMineiro != null) {
            atleticoMineiroList.remove(atleticoMineiro);
            return true;
        }

        return false;
    }
}
