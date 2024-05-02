package videwofourth;

public class Campaing {

	private int id;
	private String campaingDetails;
	
	
	public Campaing(int id, String campaingDetails) {


		this.id = id;
		this.campaingDetails = campaingDetails;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaingDetails() {
		return campaingDetails;
	}
	public void setCampaingDetails(String campaingDetails) {
		this.campaingDetails = campaingDetails;
	}
	
	
}
