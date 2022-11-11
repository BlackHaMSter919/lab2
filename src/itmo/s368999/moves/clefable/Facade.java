package itmo.s368999.moves.clefable;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {


		public Facade(double pow, double acc) { 
		super(Type.NORMAL, pow, acc);
		}
		
		@Override
		protected void applyOppDamage(Pokemon opp, double damage) { 
			super.applyOppDamage(opp, damage);
			if(opp.getCondition() == Status.POISON) {	
			opp.setMod(Stat.HP, (int) (2*damage));
			}
			if(opp.getCondition() == Status.PARALYZE) {	
				opp.setMod(Stat.HP, (int) (2*damage));
			}
		}
		@Override	
		protected String describe() { 
			return "does" +" "+ "Facade";
			
		}
	}