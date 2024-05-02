package videwofourth;

public class Main {

	public static void main(String[] args) {
	
	PlayerManager playerManager = new PlayerManager();
	CampaingManager campaingManager = new CampaingManager();
		Player arda = new Player(1,"Arda", "Çetinkaya","11111111111","12,03,2004");
	Game game1 = new Game(1,"RDR3");
	Game game2 = new Game(2,"VVW");
	Game game3 = new Game(3,"Yılan oyunu");
	
	Campaing campaing1 = new Campaing(1, "alınan 3.oyun yarı fiyatına");
	
	playerManager.update(arda);
	playerManager.save(arda);
playerManager.vertify(arda);
	
 playerManager.gameSale(arda, game1);
 
 playerManager.gameSale(arda, game2);
 campaingManager.addNewCamp(campaing1);	
 playerManager.gameSaleWithCampaing(game3, arda, campaing1);
 
 
 


	}

}
