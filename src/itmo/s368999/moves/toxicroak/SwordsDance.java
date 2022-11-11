package itmo.s368999.moves.toxicroak;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends StatusMove {


		public SwordsDance(double pow, double acc) { 
		super(Type.NORMAL, pow, acc);
		}
		@Override
		protected void applySelfEffects(Pokemon p) {
			super.applySelfEffects(p);
			Effect e = new Effect().stat(Stat.ATTACK, 2);
			p.addEffect(e);
		}
		@Override
		protected String describe() { 
			return "does" +" "+ "Swords Dance";
			
		}
	}