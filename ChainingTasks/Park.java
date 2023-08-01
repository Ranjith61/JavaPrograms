class Park{
	
	String name;
	int capacity;
	String place;
	int width;
	String size;
	String shape;
	String colour;
	String duration;
	int length;
	
	Park()
	{
		super();
		System.out.println("Invoking with no-arg");
	}
	
	Park(String name)
	{
		super();
		this.name=name;
		System.out.println("Invoking the name of the park");	
	}
	
	Park(String name,int capacity)
	{
		this(name);
		this.capacity=capacity;
		System.out.println("Invoking the name and capacity of the park");
	}
	
	Park(String name,int capacity,String place)
	{
		this(name,capacity);
		this.place=place;
		System.out.println("Invoking the name,capacity and place of the park");
	}

	Park(String name,int capacity,String place,int width)
	{
		this(name,capacity,place);
		this.width=width;
		System.out.println("Invoking the name,capacity,place and width of the park");
	}

	Park(String name,int capacity,String place,int width,String size)
	{
		this(name,capacity,place,width);
		this.size=size;
		System.out.println("Invoking the name,capacity,place,width and size of the park");
	}

	Park(String name,int capacity,String place,int width,String size,String shape)
	{
		this(name,capacity,place,width,size);
		this.shape=shape;
		System.out.println("Invoking the name,capacity,place,width,size and shape of the park");
	}
	
	Park(String name,int capacity,String place,int width,String size,String shape,String colour)
	{
		this(name,capacity,place,width,size,shape);
		this.colour=colour;
		System.out.println("Invoking the name,capacity,place,width,size,shape and colour of the park");
	}
	
	Park(String name,int capacity,String place,int width,String size,String shape,String colour,String duration)
	{
		this(name,capacity,place,width,size,shape,colour);
		this.duration=duration;
		System.out.println("Invoking the name,capacity,place,width,size,shape,colour and duration of the park");	
	}
	
	Park(String name,int capacity,String place,int width,String size,String shape,String colour,String duration,int length)
	{
		this(name,capacity,place,width,size,shape,colour,duration);
		this.length=length;
		System.out.println("Invoking the name,capacity,place,width,size,shape,colour,duration and length of the park");	
	}

	
	public static void main(String[] args)
	{
		System.out.println("Invoking main in Park");
		Park park=new Park("Budda park",800,"Nagarabhavi",550,"5 acers","Round","Green","11PM-6AM",300);
	

		System.out.println("------------------");
	
	
		System.out.println("Invoking name and capacity of the park");
		Park park1=new Park("Bullbull",450);
		
		System.out.println("------------------");

		
		System.out.println("no args");
		Park park2=new Park();

		

	}

	
}