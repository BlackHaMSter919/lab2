package itmo.s368999.moves.clefable;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class WorkUp extends StatusMove {


		public WorkUp(double pow, double acc) { 
		super(Type.NORMAL, pow, acc);
		}
		@Override
		protected void applySelfEffects(Pokemon p) {
			super.applySelfEffects(p);
			Effect e = new Effect().chance(0.3).stat(Stat.SPECIAL_ATTACK, 1); 
			Effect r = new Effect().chance(0.3).stat(Stat.ATTACK, 1);
			p.addEffect(e);
			p.addEffect(r);
		}
		
		@Override
		protected String describe() { 
			return "does" +" "+ "Work Up";
		}
}