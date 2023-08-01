//chaining
class Wood{
	
	String type;
	int prize;
	String colour;
	int weight;
	String shape;
	
	Wood()
	{
		super();
		System.out.println("invoking no arguments");
	}
	
	Wood(String type)
	{
		super();
		System.out.println("invoking string type of wood");
		this.type=type;
	}
	
	Wood(String type,int prize)
	{
		this(type);
		this.prize=prize;
		System.out.println("invoking String type & int prize of wood");		
	}
	
	Wood(String type,int prize,String colour)
	{
		this(type,prize);
		this.colour=colour;
		System.out.println("invoking String type,int prize,String colour of the wood");
	}
	
	Wood(String type,int prize,String colour,int weight)
	{
		this(type,prize,colour);
		this.weight=weight;
		System.out.println("invoking String type,int prize,String colour and int weight of the wood");
	}
	
	Wood(String type,int prize,String colour,int weight,String shape)
	{
		this(type,prize,colour,weight);
		this.shape=shape;	
		System.out.println("invoking String type,int prize,String colour,int weight and String shape of the wood");
	}	
}