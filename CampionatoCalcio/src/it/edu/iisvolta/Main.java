package it.edu.iisvolta;

public class Main {

	public static void main(String[] args) {
		Campionato c=new Campionato("Serie A");
		
		c.getElencoSquadre().add(new Squadra("Lecce"));
		c.getElencoSquadre().add(new Squadra("Napoli"));
		c.getElencoSquadre().add(new Squadra("Roma"));
		c.getElencoSquadre().add(new Squadra("Lazio"));
		c.getElencoSquadre().add(new Squadra("Fanfulla Lodi"));
		
		c.generaCalendario();
		
		for(Partita partita:c.getElencoPartite()) {
			partita.simulaPartita();
			
			System.out.println(
					partita.getSquadraCasa().getNome()+ " - "+ 
					partita.getSquadraFuori().getNome()+ " : "+
					partita.getGolCasa()+" - "+ 
					partita.getGolFuori());
		}
			
		
		System.out.println("\n\nCLASSIFICA: ");
		for(Squadra s:c.getElencoSquadre()) 
			System.out.println(s.getNome()+": "+s.getPunti());
	}

}
