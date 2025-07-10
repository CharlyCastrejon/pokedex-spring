package com.example.pokedex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

    private String name;
    private int id;
    private Sprites sprites;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Sprites {
        @JsonProperty("front_default")
        private String frontDefault;

        // Getters and Setters
        public String getFrontDefault() {
            return frontDefault;
        }

        public void setFrontDefault(String frontDefault) {
            this.frontDefault = frontDefault;
        }
    }
}