package bolt;

import java.util.Date;

public class Elelmiszer {
	private Long vonalKod;
	private String gyarto;
	private Date szavatossagiIdo;
	
	public Elelmiszer(Long vonalKod, String gyarto, Date szavatossagiIdo) {
		super();
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
	}

	public Long getVonalKod() {
		return vonalKod;
	}
	
	public boolean joMeg()
	{
		Date currentDate = new Date();
		if (getSzavatossagiIdo().before(currentDate))
		{
			return true;
		}
		return false;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}
	
	@Override
	public String toString()
	{
		return "Élelmiszer";
	}
}
