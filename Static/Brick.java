class Brick{
int price;
int durability;
static String colour;
static String timeToMake;

Brick(int price, int durability)
{
	System.out.println("Invoking the price and durability values");
	this.price=price;
	this.durability=durability;
}
static{
	colour="red";
	timeToMake="4 hour";
}
}