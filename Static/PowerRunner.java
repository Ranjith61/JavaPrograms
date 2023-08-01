class PowerRunner{
public static void main(String[] info)
{
System.out.println("Running the power values");
Power power=new Power("kona","50W");
System.out.println(power.body);
System.out.println(power.howMuchPower);
System.out.println(power.TypeOfPower);
System.out.println(power.timming);
Power.TypeOfPower="Lightning";
Power.timming=8;
System.out.println(Power.TypeOfPower);
System.out.println(Power.timming);

System.out.println("~~~~~~~~~~~~~~~~~~");

Power power1=new Power("philips","45W");
System.out.println(power1.body);
System.out.println(power1.howMuchPower);
System.out.println(power1.TypeOfPower);
System.out.println(power1.timming);
Power.TypeOfPower="burning";
Power.timming=10;
System.out.println(Power.TypeOfPower);
System.out.println(Power.timming);

}
}