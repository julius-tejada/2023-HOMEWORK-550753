package it.uniroma3.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.* ;

public class StanzaBuia {
	private String nomeAttrezzoPerVedere ;
	public final static String DESCRIZIONE_STANZA_BUIA = "Qui cè buoi!" ;
	
	public StanzaBuia(String nome ,String nomeAttezzoPerVedere) {
		super(nome) ;
		this.nomeAttrezzoPerVedere = nomeAttezzoPerVedere ;
	}
	
	public String getDescrizione() {
		if(!super.hasAttrezzo(nomeAttrezzoPerVedere)) ;
			return DESCRIZIONE_STANZA_BUIA ;
		return super.getDescrizione() ;
	}
}
