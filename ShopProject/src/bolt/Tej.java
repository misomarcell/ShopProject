package bolt;

import java.util.Date;

public abstract class Tej extends Elelmiszer{
	public final int LITER = 1;
	public final double FELLITER = 0.5;
	public final double POHAR = 0.25;
	public final double ZSIROS = 2.8;
	public final double FELZSIROS = 1.5;
	protected int urtartalom;
	protected double zsirtartalom;
	
	public Tej(Long vonalKod, String gyarto, Date szavatossagiIdo,int urtartalom,double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.urtartalom = urtartalom;
		this.zsirtartalom = zsirtartalom;
	}
	
	public int getUrtartalom() {
		return urtartalom;
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
