class Mall{
	
	String name;
	int prize;
	String place;
	String owner;
	double capacity;
	String acers;
	int floors;
	
	Mall()
	{
		super();
		System.out.println("Invoking no arg");	
	}

	Mall(String name)
	{
		super();
		this.name=name;
		System.out.println("invoking string name of mall");		
	}
	
	Mall(String name,int prize)
	{
		this(name);
		this.prize=prize;
		System.out.println("invoking string name and prize of mall");			
	}
	
	Mall(String name,int prize,String place)
	{
		this(name,prize);
		this.place=place;
		System.out.println("invoking string name,prize and place of mall");
	}
	
	Mall(String name,int prize,String place,String owner)
	{
		this(name,prize,place);
		this.owner=owner;
		System.out.println("invoking string name,prize,place and owner of mall");		
	}
	
	Mall(String name,int prize,String place,String owner,double capacity)
	{
		this(name,prize,place,owner);
		this.capacity=capacity;
		System.out.println("invoking string name,prize,place,owner and capacity of mall");
	}
	
	Mall(String name,int prize,String place,String owner,double capacity,String acers)
	{
		this(name,prize,place,owner,capacity);
		this.acers=acers;
		System.out.println("invoking string name,prize,place,owner,capacity and acers of mall");	
	}
	
	Mall(String name,int prize,String place,String owner,double capacity,String acers,int floors)
	{
		this(name,prize,place,owner,capacity,acers);
		this.floors=floors;
		System.out.println("invoking string name,prize,place,owner,capacity,acers and floors of mall");	
	}	

	public static void main(String[] args)
	{
		System.out.println("invoking main in mall");
		Mall mall=new Mall("Lulu",500000,"Majestic","D K ShivaKumar",30000,"10 acers",8);		
		
	}
	
}