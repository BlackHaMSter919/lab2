package itmo.s368999.moves.basculin;



import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class HeadSmash extends PhysicalMove {

        
		public HeadSmash(double pow, double acc) { 
		super(Type.ROCK, pow, acc);
		}
		@Override
		protected void applySelfDamage(Pokemon att, double damage) { 
			super.applySelfDamage(att, damage);
			att.setMod(Stat.HP, (int) ((int) damage*0.5));
			
			

		
			}
		@Override
		protected String describe() { 
			return "does" +" "+ "Head Smash";
			
		}
	}