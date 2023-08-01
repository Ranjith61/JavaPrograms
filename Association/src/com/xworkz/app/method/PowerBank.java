package method;

public class PowerBank {
public int price=1599;
public Battery ref=new Battery();
public void capacity()
{
	System.out.println("The capacity of the battery is 4000");
	if(ref!=null)
	{
	ref.mah("eat");
	ref.price();
	
	}
	else{
		System.out.println("value to the Battery");
	}
}
}