package Pokemon;

import Typings.PokeType;

import java.util.HashMap;

public class Pokemon {
    //#,Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary
    public int PokedexNum;
    public PokeType[] type;
    public HashMap<String, Integer> stats;
    public int generation;
    public boolean legendary;

    public void LoadPokemon(){

    }
}
