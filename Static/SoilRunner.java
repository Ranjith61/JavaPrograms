class SoilRunner{
	public static void main(String[] info)
	{
		Soil soil=new Soil("black",3400);
		System.out.println(soil.soilColour);
		System.out.println(soil.howManyStone);
		System.out.println(soil.howMnayYear);
		System.out.println(soil.soilType);
		Soil.howMnayYear=10;
		Soil.soilType=" dry sand";
		System.out.println(soil.howMnayYear);
		System.out.println(soil.soilType);
		
		System.out.println("----------------------");
		
		
		Soil soil1=new Soil("white",2500);
		System.out.println(soil1.soilColour);
		System.out.println(soil1.howManyStone);
		System.out.println(soil1.howMnayYear);
		System.out.println(soil1.soilType);
		Soil.howMnayYear=40;
		Soil.soilType="wet sand";
		System.out.println(soil.howMnayYear);
		System.out.println(soil.soilType);
		
		
	}
}