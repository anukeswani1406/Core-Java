package game;
public class indoor
{
	String pname,gname;
	public indoor(String pname,String gname)
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
