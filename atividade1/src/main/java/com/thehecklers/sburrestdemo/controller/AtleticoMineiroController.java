package com.thehecklers.sburrestdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thehecklers.sburrestdemo.service.AtleticoMineiroService;

import com.thehecklers.sburrestdemo.model.AtleticoMineiro;


@RestController
@RequestMapping("/atleticoMineiro")
public class AtleticoMineiroController
{
    @Autowired
    private AtleticoMineiroService atleticoMineiroService;

	@GetMapping
	Iterable<AtleticoMineiro> getAllAtleticoMineiro() {
		return atleticoMineiroService.getAllAtleticoMineiro();
	}

    @GetMapping("/{id}")
    AtleticoMineiro getAtleticoMineiroById(@PathVariable String id)
    {
        return atleticoMineiroService.getAtleticoMineiroById(id);
    }

    @PostMapping
    AtleticoMineiro addAtleticoMineiro(@RequestBody AtleticoMineiro atleticoMineiro)
    {
        return atleticoMineiroService.addAtleticoMineiro(atleticoMineiro);
    }

    @PutMapping("/{id}")
    AtleticoMineiro editAtleticoMineiro(@PathVariable String id, @RequestBody AtleticoMineiro atleticoMineiro)
    {
        return atleticoMineiroService.editAtleticoMineiro(id, atleticoMineiro);
    }

    @DeleteMapping("{id}")
    Boolean deleteAtleticoMineiro(@PathVariable String id)
    {
        return atleticoMineiroService.deleteAtleticoMineiro(id);
    }
}
