package itmo.s368999.pokemons;

import itmo.s368999.moves.clefable.*;
import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Cleffa { 
	
	public Clefairy(String name, int level) {
		super(name, level);
		
		super.setStats(70, 45, 48, 60, 65, 35);
		super.setType(Type.FAIRY);
		
		Moonblast Moonblast = new Moonblast(95, 100);
		super.setMove(Moonblast);
	}
}