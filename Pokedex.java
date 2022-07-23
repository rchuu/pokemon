// Create a Pokedex class that extends the abstract class above and implements listPokemon(). Your Pokedex class needs an attribute called myPokemons where you store all the pokemons created.

public class Pokedex extends PokemonAbstract {
    public void pokemonInfo(PokemonClass pokemon) {
        System.out.println(pokemon.getName() + " " + pokemon.getHealth() + " " + pokemon.getType());
    }
}
