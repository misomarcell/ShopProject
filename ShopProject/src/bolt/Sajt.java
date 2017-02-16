package bolt;

import java.util.Date;

public class Sajt extends Elelmiszer{

	protected double zsirtartalom;
	protected double suly;

	public Sajt(Long vonalKod, String gyarto, Date szavatossagiIdo,double suly,double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.suly = suly;
		this.zsirtartalom = zsirtartalom;
	}

}