package videwofourth;

public class CampaingManager implements CampaingService{

	@Override
	public void addNewCamp(Campaing campaing) {
		System.out.println("yeni kampanya eklendi");
		
	}

	@Override
	public void deleteCamp(Campaing campaing) {
	System.out.println("kampanya silindi");
		
	}

	@Override
	public void updateCamp(Campaing campaing) {
System.out.println("kampanya güncellendi");
		
	}

}
