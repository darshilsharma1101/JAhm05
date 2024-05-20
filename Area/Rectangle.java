package Area;

public class Rectangle {
	private int length;
	private int bridth;
	public void Setdim(int length,int bridth)
	{
		this.length=length;
		this.bridth=bridth;
	}
	public int GetArea()
	{
		return length * bridth;
	}
	
}


