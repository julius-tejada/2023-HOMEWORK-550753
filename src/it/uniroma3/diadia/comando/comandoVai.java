package it.uniroma3.diadia.comando;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

public class comandoVai implements Comando {
	
	private String parametro ;
	private IO io ;
	private final static String NOME = "vai" ;

	
	@Override
	public void esegui(Partita partita) {
		Stanza stanzaCorrente = partita.getStanzaCorrente() ;
		Stanza prossimaStanza = null ;

		if(this.parametro==null) {
			this.io.mostraMessaggio("Dove vuoi andare?");
			return ;
		}

		partita.setStanzaCorrente(prossimaStanza);
		this.io.mostraMessaggio(partita.getStanzaCorrente().getNome());
		Giocatore giocatore = partita.getGiocatore() ;
		
		}
@Override
public void setParametro(String parametro) {
	this.parametro = parametro ;
}
//@Override
public String getNome() {
	return NOME ;
}
//@Override
public String getParametro() {
	return this.parametro ;
}

//@Override
public void setIO(IO io) {
	this.io = io ;

}
}
