package itmo.s368999.moves.toxicroak;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Flatter extends StatusMove {


		public Flatter(double pow, double acc) { 
		super(Type.DARK, pow, acc);
		}
		@Override
		protected void applyOppEffects(Pokemon p) {
			super.applyOppEffects(p);
			Effect.confuse(p);
		}
		@Override
		protected void applySelfEffects(Pokemon p) {
			super.applySelfEffects(p);
			Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
			p.addEffect(e);
		}
		@Override
		protected String describe() { 
			return "does" +" "+ "Flatter";
			
		}
	}