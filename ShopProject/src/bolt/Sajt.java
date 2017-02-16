package bolt;

import java.util.Date;

public class Sajt {

	private double suly;
	private double zsirtartalom;
	private Long vonalKod;
	private String gyarto;
	private Date szavatossagiIdo;
	
	public Sajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		super();
		this.suly = suly;
		this.zsirtartalom = zsirtartalom;
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
	}

	public double getSuly() {
		return suly;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	@Override
	public String toString()
	{
		return "Sajt";
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
	
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}
	
	public Long getVonalKod() {
		return vonalKod;
	}

	public String getGyarto() {
		return gyarto;
	}
	
	
}
