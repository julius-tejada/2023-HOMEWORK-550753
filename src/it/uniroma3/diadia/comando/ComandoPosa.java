/**
 * 
 */
package it.uniroma3.diadia.comando;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;


public class ComandoPosa implements Comando {
	private String nomeAttrezzo ;
	private IOConsole io ;
	private final static String NOME = "posa" ;
	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro ;
	}

	@Override
	public void esegui(Partita partita) {
		Borsa borsa = partita.getGiocatore().getBorsa() ;
		Attrezzo attrezzoDaPosare = borsa.getAttrezzo(getParametro()) ;
		if(attrezzoDaPosare == null) {
			this.io.mostraMessaggio("Attrezzo" + attrezzoDaPosare + "non presente nella borsa" );
			return ;
		}
		boolean attrezzoPosato = partita.getStanzaCorrente().addAttrezzo(attrezzoDaPosare) ;
		if(!attrezzoPosato) {
			this.io.mostraMessaggio("non cè piu spazio per nuovi attrezzi"); 
			return ;
		}
		borsa.removeAttrezzo(getParametro()) ;
		this.io.mostraMessaggio("Attrezzo "+ nomeAttrezzo +" Posato!") ;
	}


	public void setIO(IOConsole io) {
		this.io = io ;

	}


	public String getParametro() {
		
		return this.nomeAttrezzo ;
	}


	public String getNome() {

		return NOME ;
	}

}
