package it.edu.iisvolta;

import java.util.Random;

public class Partita {
	private Squadra squadraCasa,squadraFuori;	
	private int golCasa, golFuori;
	
	public Partita(Squadra squadraCasa, Squadra squadraFuori) {
		super();
		this.squadraCasa = squadraCasa;
		this.squadraFuori = squadraFuori;
		golCasa=0;
		golFuori=0;
	}

	public int getGolCasa() {
		return golCasa;
	}

	public void setGolCasa(int golCasa) {
		if (golCasa<0)
			System.out.println("Nr di gol non valido!");
		else
			this.golCasa = golCasa;
	}

	public int getGolFuori() {
		return golFuori;
	}

	public void setGolFuori(int golFuori) {
		if (golFuori<0)
			System.out.println("Nr di gol non valido!");
		else
			this.golFuori = golFuori;
	}

	public Squadra getSquadraCasa() {
		return squadraCasa;
	}

	public Squadra getSquadraFuori() {
		return squadraFuori;
	}
	
	public void simulaPartita() {
		Random r=new Random();
		
		golCasa=r.nextInt(6);		//da 0 a 5
		golFuori=r.nextInt(6);		//da 0 a 5
		
		if (golCasa>golFuori)	{
			// ha vinto squadraCasa	
			squadraCasa.setPunti(squadraCasa.getPunti()+3);
		} else if (golCasa<golFuori) {
			// ha vinto squadraFuori
			squadraFuori.setPunti(squadraFuori.getPunti()+3);
		} else {
			// hanno pareggiato
			squadraCasa.setPunti(squadraCasa.getPunti()+1);
			squadraFuori.setPunti(squadraFuori.getPunti()+1);
		}
		
	}
	
	
	
}
