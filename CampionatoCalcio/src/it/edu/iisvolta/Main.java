package it.edu.iisvolta;

public class Main {

	public static void main(String[] args) {
		Campionato c=new Campionato("Serie A");
		
		c.getElencoSquadre().add(new Squadra("Lecce"));
		c.getElencoSquadre().add(new Squadra("Napoli"));
		c.getElencoSquadre().add(new Squadra("Roma"));
		c.getElencoSquadre().add(new Squadra("Lazio"));
		
		c.generaCalendario();
		
		for(Partita p:c.getElencoPartite())
			System.out.println(
				p.getSquadraCasa().getNome()+ " - "+ 
				p.getSquadraFuori().getNome());
	}

}
