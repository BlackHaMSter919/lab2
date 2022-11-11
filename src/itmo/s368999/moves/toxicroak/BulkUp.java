package itmo.s368999.moves.toxicroak;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class BulkUp extends StatusMove {


		public BulkUp(double pow, double acc) { 
		super(Type.FIGHTING, pow, acc);
		}
		@Override
		protected void applySelfEffects(Pokemon p) {
			super.applySelfEffects(p);
			Effect e = new Effect().stat(Stat.DEFENSE, 1);
			Effect r = new Effect().stat(Stat.ATTACK, 1);
			p.addEffect(e);
			p.addEffect(r);
		}
		@Override
		protected String describe() { 
			return "does" +" "+ "Bulk Up";
			
		}
	}