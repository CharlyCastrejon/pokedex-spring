package com.example.pokedex.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.pokedex.model.Pokemon;

@Service
public class PokeApiService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon/";

    public Pokemon getPokemon(String nameOrId) {
        try {
            String url = POKEAPI_URL + nameOrId.toLowerCase();
            return restTemplate.getForObject(url, Pokemon.class);
        } catch (Exception e) {
            // Basic error handling (e.g., Pokémon not found)
            return null;
        }
    }
}