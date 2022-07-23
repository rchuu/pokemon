// Create an abstract class that only implements createPokemon and pokemonInfo(Pokemon pokemon) from the PokemonInterface.

public abstract class PokemonAbstract implements PokemonInterface {

    public PokemonClass createPokemon(String pokemonName, int pokemonHealth, String pokemonType) {
        return new PokemonClass(pokemonName, pokemonHealth, pokemonType);
    }

    public void attackPokemon(PokemonClass pokemon) {
        pokemon.setHealth(pokemon.getHealth() - 10);
    }
}