package videwofourth;

public class PlayerManager implements PlayerService {

	@Override
	public void save(Player player) {
	
		System.out.println(player.getFirstName() + " adlı oyuncu, sisteme kayıt oldu");
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " adlı oyuncu bilgilerini güncelledi");
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+ " adlı oyuncu kayıtını sildi");
	}

	@Override
	public void vertify(Player player) {
		System.out.println("bilgiler e-devlet üzerinden doğrulandı");
		System.out.println("kullanıcı bilgileri: ");
	System.out.println(player.getFirstName());
	System.out.println(player.getLastName());
	System.out.println(player.getTc());
	System.out.println(player.getBirthDate());
	}

	@Override
	public void gameSale(Player player, Game game) {
		System.out.println(player.getFirstName() + " oyuncusu "+ game.getName()+ "oyununu satın aldı");
		
	}

	@Override
	public void gameSaleWithCampaing(Game game, Player player, Campaing campaing) {
		System.out.println(player.getFirstName()+ " oyuncusu "+ game.getName()+ " oyununu "+ campaing.getCampaingDetails()+ " campanyasıyla satın aldı");
		
	}
	
		
	

	
	
}
