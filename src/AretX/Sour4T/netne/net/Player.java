package AretX.Sour4T.netne.net;

public class Player {
private String Player;
private int PlayerFichas = 7;
private int PlayerTurno = 1;

	Player(String name){
		this.Player = name;
	}

	public String getPlayer(){
		return this.Player;
	}
	
	public int getFicha(){
		return this.PlayerFichas;
	}
	
	public void lessFichas(){
		PlayerFichas -=1;
	}

	public void setTurno(int turno){
		this.PlayerTurno = turno;
	}
	public int getTurno(){
		return this.PlayerTurno;
	}
}
