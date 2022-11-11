package itmo.s368999.pokemons;

import itmo.s368999.moves.clefable.*;
import ru.ifmo.se.pokemon.Type;

public class Clefable extends Clefairy { 
	
	public Clefable(String name, int level) {
		super(name, level);
		
		super.setStats(95, 70, 73, 95, 90, 60);
		super.setType(Type.FAIRY);
		
		CalmMind CalmMind= new CalmMind(0,100);
		super.setMove(CalmMind);
	}
}