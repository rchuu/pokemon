public class PokemonClass {
    // Create a Pokemon class with: name, health, and type member variables.
    private String name;
    private int health;
    private String type;
    // Create a Pokemon class with: a count static variable that keeps the number of
    // Pokemon created in the program.
    private static int numberOfPokemons = 0;

    // Create a Pokemon class with: a constructor class to set the instance's name,
    // health, and type on creation
    public PokemonClass(String pokemonName, int pokemonHealth, String pokemonType) {
        name = pokemonName;
        health = pokemonHealth;
        type = pokemonType;
        numberOfPokemons++;
    }

    // Create a Pokemon class with: void attackPokemon(Pokemon pokemon): This method
    // lowers the attacked Pokemon's health by 10

    public void attackPokemon(PokemonClass pokemon) {
        pokemon.health -= 10;
    }

    // Create a Pokemon class with: getters and setters for each member variable.

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Create an interface for the following methods: Pokemon createPokemon(String
    // name, int health, String type): This method creates and returns Pokemon.

    public PokemonClass createPokemon(String pokemonName, int pokemonHealth, String pokemonType) {
        return new PokemonClass(name, health, type);
    }

    // Create an interface for the following methods: String pokemonInfo(Pokemon
    // pokemon): This method returns a String with the name, health, and type of the
    // pokemon.

    // Create an interface for the following methods: void listPokemon(): List all
    // the pokemon names that you have in your pokedex.

    public void pokemonInfo(PokemonClass pokemon) {
        System.out.println("Name: " + pokemon.name + " Health: " + pokemon.health + " Type: " + pokemon.type);
    }
}