package bolt;

public abstract class Aru {
	
	protected Long vonalKod;
	protected String gyarto;
	
	public Aru(Long vonalKod, String gyarto) {
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
	}
	public Long getVonalKod(){
		return vonalKod;
	}
	public String getGyarto(){
		return gyarto;
	}
}