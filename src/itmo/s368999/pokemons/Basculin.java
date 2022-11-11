package itmo.s368999.pokemons;

import itmo.s368999.moves.basculin.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Basculin extends Pokemon { 
	
	public Basculin(String name, int level) {
		super(name, level);
		
		super.setStats(70, 92, 65, 80, 55, 98);
		super.setType(Type.WATER);
		
		MuddyWater MuddyWater = new MuddyWater(90, 85);
		HeadSmash HeadSmash = new HeadSmash(150,80);
		Scald Scald = new Scald(80, 100);
		IceBeam IceBeam= new IceBeam(90, 100);
		super.setMove(MuddyWater, HeadSmash, Scald, IceBeam);
	}
}
