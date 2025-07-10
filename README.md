# Pokedex with Spring Boot 🚀

A simple web application built with Spring Boot that works like a Pokedex, allowing users to search for Pokémon by name or number.

---

## 🛠️ Technologies Used

- **Backend:** Spring Boot 3.5.3  
- **Language:** Java 21  
- **Template Engine:** Thymeleaf  
- **Dependency Management:** Maven  
- **External API:** [PokeAPI](https://pokeapi.co/)  
- **Containerization:** Docker  
- **Deployment:** Render 

---

## ⚙️ How It Works

1. The user enters a Pokémon's name or number into the search field.  
2. The application sends a request to the Spring Boot backend.  
3. The backend consumes the PokeAPI to fetch the requested Pokémon's data.  
4. The information (name, ID, and sprite) is displayed on the view thanks to Thymeleaf.
