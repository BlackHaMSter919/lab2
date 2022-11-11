package itmo.s368999.pokemons;

import itmo.s368999.moves.toxicroak.*;
import ru.ifmo.se.pokemon.Type;

public class Toxicroak extends Croagunk { 
	
	public Toxicroak(String name, int level) {
		super(name, level);
		
		super.setStats(83, 106, 65, 86, 65, 85);
		super.setType(Type.POISON, Type.FIGHTING);
		SwordsDance SwordsDance = new SwordsDance(0,100);
	super.setMove(SwordsDance);	
	}
}