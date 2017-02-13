package bolt;

import java.time.LocalDate;
import java.util.Date;

public class Tej {

	protected long vonalkod;
	
	final int LITER;
	final int FELLITER;
	final int POHAR;
	final double ZSIROS;
	final double FELZSIROS;
	
	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;
	
	public Tej(long vonalkod, int urtartalom, String gyarto, Date szavatossag, double zsirtartalom) {

		this.vonalkod = vonalkod;
		
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossag;
		this.zsirtartalom = zsirtartalom;
	}
	
	public long getVonalkod()
	{
		return vonalkod;
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
	
	public int getUrtartalom() {
		return urtartalom;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}
	
	@Override
	public String toString()
	{
		return "Tej: " + getUrtartalom() + "Liter " +
						getGyarto() + " " +
						getZsirtartalom() + "% " +
						getSzavatossagiIdo();
	}
	
}
