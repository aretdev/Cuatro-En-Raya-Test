package AretX.Sour4T.netne.net;

import java.util.Scanner;

public class Game {
private Scanner sc = new Scanner(System.in);
private int Turno = 1 ;
private Player RedPlayer = new Player("Red Player");
private Player BluePlayer = new Player("Blue Player");
private Map map = new Map();
	
	
	
	public void init(){
		//SET PLAYERS//
		map.printMap();
		loop();
	}
	
	public void loop(){
		
		while (true) {
			
			if(Turno != 8){
				if(Turno%2 != 0){
					System.out.println("Turno del jugador " + RedPlayer.getPlayer());
					int NumberPos = sc.nextInt();
					if (NumberPos > 7 || NumberPos <= 0) {
						System.out.println("Fuera de los márgenes.");
					}else{
						map.addPos(NumberPos, RedPlayer.getPlayer());
						map.printMap();
						Turno+=1;
					}
					
				}else{
					System.out.println("Turno del jugador " + BluePlayer.getPlayer());
					
					int NumberPos = sc.nextInt();
					if (NumberPos > 7 || NumberPos <= 0) {
						System.out.println("Fuera de los márgenes.");
					}else{
						map.addPos(NumberPos, BluePlayer.getPlayer());
						map.printMap();
						Turno+=1;
					}
				}
				
			}else{
				System.out.println("Ganador asdasdasd");
				break;
			}
			
		}
	}
}
