package itmo.s368999.moves.basculin;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MuddyWater extends SpecialMove {


		public MuddyWater(double pow, double acc) { 
		super(Type.WATER, pow, acc);
		}
		@Override
		protected void applyOppEffects(Pokemon p) {
			super.applyOppEffects(p);
			Effect e = new Effect().chance(0.3).stat(Stat.ACCURACY, -1);
			p.addEffect(e);
			}
		@Override
		protected String describe() { 
			return "does" +" "+ "Muddy Water";
			
		}
	}