package business;

public class Client {
	
	private int idClient;
	private String raisonSociale;
	
	public Client(int idClient, String raisonSociale) {
		super();
		this.idClient = idClient;
		this.raisonSociale = raisonSociale;
	}
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	@Override
	public String toString() {
		return "Client [raisonSociale=" + raisonSociale + "]";
	}
	
	
	
}
