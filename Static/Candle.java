class Candle{
	int duration;
	int price;
	static String specification;
	static String shape;

	Candle(int duration,int price)
{
	System.out.println("printing the time and price values");
	this.specification=specification;
	this.shape=shape;
}
	static{
    specification="burning";
	shape="long";
}
}