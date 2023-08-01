class Power{
String body;
String howMuchPower;
static String TypeOfPower;
static int timming;

Power(String body,String howMuchPower)
{
	System.out.println("Invoking power values");
	this.body=body;
	this.howMuchPower=howMuchPower;
}
static{
	TypeOfPower="electricity";
	timming=15;
}
}