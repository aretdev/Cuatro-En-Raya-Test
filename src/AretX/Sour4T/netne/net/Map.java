package AretX.Sour4T.netne.net;

public class Map {
private static final int WIDTH = 8;
private static final int HEIGHT = 8;

public int[][] Map = new int[HEIGHT*WIDTH][WIDTH*HEIGHT];


	public void printMap(){
		for (int i = 1; i < HEIGHT; i++) {
			for (int j = 1; j < WIDTH; j++) {
				System.out.print(Map[j][i] + " ");
				System.out.print("");
			}
			System.out.print("\n");
		}
	}
	
	
	public void addPos(int pos,String Player){
		int PosY = 7;//empezamos desde abajo
		
		int ficha;
			if (Player.equals("Red Player")) {
				ficha =1;
			}else{
				ficha =2;}
			
		while(true){
			
		if (Map[pos][PosY]== 1 ||Map[pos][PosY]== 2) {
			PosY-=1;
			
		}else{
			Map[pos][PosY] = ficha;
			break;
			}
		}
	}
	
	public int checkGanador(String player){//el problema esque solo compruebo la 1º linea y no sé como comprovar toooda la tabla shiet
		int idCount;
		
		int Count = 0;
		
		if (player.equals("Red Player")) {
			idCount=1;
		}else{
			idCount=2;
		}
		for (int i = 0; i < Map.length; i++) {
			if (Map[1][i] ==idCount) {
				Count+=1;
			}
		if (Count == 4) {
			return 1;

			}
		}
		return 0;
	}
	
	
}
