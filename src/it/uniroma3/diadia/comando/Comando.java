package it.uniroma3.diadia.comando;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public interface Comando {

	public void setParametro(String parametro) ;
	public void esegui(Partita partita) ;
	public void setIO(IO io) ;
	public String getParametro() ;
	public String getNome() ;


}
