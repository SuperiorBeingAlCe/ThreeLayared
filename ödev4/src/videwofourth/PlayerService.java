package videwofourth;

public interface PlayerService {

	public void save(Player player);
	
	public void update(Player player);

	public void delete(Player player);
	
	public void vertify(Player player);
	
	public void gameSale(Player player, Game game);
	
	public void gameSaleWithCampaing(Game game, Player player, Campaing campaing);
}
