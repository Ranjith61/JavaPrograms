class Soil{
	String soilColour;
	int howManyStone;
	static int howMnayYear;
	static String soilType;
	
	Soil(String soilColour,int howManyStone)
	{
		System.out.println("invoking soil colour and stone");
		this.soilColour=soilColour;
		this.howManyStone=howManyStone;
		
	}
static{
	howMnayYear=100;
	soilType="red soil";
}
}