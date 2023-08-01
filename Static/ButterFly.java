class ButterFly{
	
	int number;
	String colour;
	static String behaviour;
	static String shape;
	
	ButterFly(int number,String colour)
	{
		System.out.println("Running the int types,String colour");
		this.number=number;
		this.colour=colour;
	}
	static{
		behaviour="Flying";
		shape="spherical";
	}
}