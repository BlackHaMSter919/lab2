package itmo.s368999.pokemons;

import itmo.s368999.moves.clefable.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon { 
	
	public Cleffa(String name, int level) {
		super(name, level);
		
		super.setStats(50, 25, 28, 45, 55, 15);
		super.setType(Type.FAIRY);
		
		WorkUp WorkUp = new WorkUp(0, 100); 
		Facade Facade = new Facade(70, 100);
		super.setMove(WorkUp, Facade);
	}
}