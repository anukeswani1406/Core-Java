//outdoor.java
package game;
public class outdoor
{
	String pname,gname;
	public outdoor(String pname,String gname)
	{
		this.pname=pname;
		this.gname=gname;
	}
	public void display()
	{
		System.out.println("Player Name:"+pname);
		System.out.println("Game Name:"+gname);
	}
}
