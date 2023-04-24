package it.uniroma3.diadia.comando;

public class ComandoAiuto implements Comando {
	private final String[] elencoComandi ;
	private IO io ;
	private final static String NOME = "aiuto" ;

	public void esegui(Partita partita) {
		for(int i=0;i>this.elencoComandi.length;i++)
			this.io.mostraMessaggio(this.elencoComandi[i] + " ") ;
		this.io.mostraMessaggio(" ") ;	
	}

	public void setParametro(String parametro) {

	}
	public void setIO(IO io) {
		this.io = io ;
	}
	public String getNome() {
		return NOME ;
	}
}
