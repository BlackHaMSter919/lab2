package itmo.s368999.lab2;

import itmo.s368999.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {

	public static void main(String[] args) {
		start();
	}
	private static void start() {
		Battle b = new Battle();
		
		Basculin p1 = new Basculin("Max", 1);
		Clefable p2 = new Clefable("Nick", 1);
		Clefairy p3 = new Clefairy("Anton", 1);
		Cleffa p4 = new Cleffa("Oleg", 1);
		Croagunk p5 = new Croagunk("Yn", 1);
		Toxicroak p6 = new Toxicroak("Serafim", 1);

		b.addAlly(p4);
		b.addAlly(p3);
		b.addAlly(p6);
		b.addFoe(p5);
		b.addFoe(p2);
		b.addFoe(p1);
		
		b.go();

	}

	public static boolean chance(double ch) { 
		return ch > Math.random();
	}
	
}
