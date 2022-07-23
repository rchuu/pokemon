
public interface PokemonInterface {
    public PokemonClass createPokemon(String pokemonName, int pokemonHealth, String pokemonType);

    public void attackPokemon(PokemonClass pokemon);

    public void pokemonInfo(PokemonClass pokemon);

}