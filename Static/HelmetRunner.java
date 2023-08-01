class HelmetRunner{
public static void main(String[] args)
{
	Helmet helmet=new Helmet(6697,"black");
	System.out.println(helmet.price);
	System.out.println(helmet.colour);
	System.out.println(Helmet.brand);
	System.out.println(Helmet.usedFor);
	
	System.out.println("===================");
	
	Helmet.brand="unicorn";
	Helmet.usedFor="Protection";
	System.out.println(Helmet.brand);
	System.out.println(Helmet.usedFor);
	
	System.out.println("--------------------");
	
	Helmet helmet1=new Helmet(2300,"green");
	System.out.println(helmet1.price);
	System.out.println(helmet1.colour);
	Helmet.brand="splendor";
	Helmet.usedFor="riding";
	System.out.println(Helmet.brand);
	System.out.println(Helmet.usedFor);
	System.out.println(Helmet.brand);
	System.out.println(Helmet.usedFor);
	
	
}
}