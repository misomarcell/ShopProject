package bolt;
import java.util.*;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable tejpult;
	private int flag;
	
	public Bolt(String nev, String cim, String tulajdonos, Hashtable tejpult) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
	}

	public Bolt(String nev, String cim, String tulajdonos)
	{
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}
	
	public String getNev() {
		return nev;
	}

	public String getCim() {
		return cim;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}
	
	public boolean vanMegTej()
	{
		return true;
	}
	
	public void feltoltTej()
	{
		
	}
	
	public void vasarolTej(long  vonalkod)
	{
		
	}
}
