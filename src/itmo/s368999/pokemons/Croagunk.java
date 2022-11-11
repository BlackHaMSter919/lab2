package itmo.s368999.pokemons;

import itmo.s368999.moves.toxicroak.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Croagunk extends Pokemon { 
	
	public Croagunk(String name, int level) {
		super(name, level);
		
		super.setStats(48, 61, 40, 61, 40, 50);
		super.setType(Type.POISON, Type.FIGHTING);
		
		Flatter Flatter = new Flatter(0, 100);
		ShadowBall ShadowBall = new ShadowBall(80, 100);
		BulkUp BulkUp = new BulkUp(0, 100);
		super.setMove(Flatter, ShadowBall, BulkUp);
	}
}