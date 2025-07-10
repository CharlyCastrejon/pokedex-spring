package com.example.pokedex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.service.PokeApiService;

@Controller
public class PokedexController {

    @Autowired
    private PokeApiService pokeApiService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("showNotFound", false);
        return "index";
    }

    @PostMapping("/search")
    public String searchPokemon(@RequestParam("pokemonName") String pokemonName, Model model) {
        Pokemon pokemon = pokeApiService.getPokemon(pokemonName);
        model.addAttribute("pokemon", pokemon);
        model.addAttribute("showNotFound", pokemon == null);
        return "index";
    }
}