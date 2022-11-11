package itmo.s368999.moves.clefable;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Moonblast extends SpecialMove {


		public Moonblast(double pow, double acc) { 
		super(Type.FAIRY, pow, acc);
		}
		@Override
		protected void applySelfEffects(Pokemon p) {
			super.applySelfEffects(p);
			Effect e = new Effect().chance(0.3).stat(Stat.SPECIAL_ATTACK, -1); 
			p.addEffect(e);
		}
		@Override
		protected String describe() { 
			return "does" +" "+ "Moonblast";
			
		}
	}