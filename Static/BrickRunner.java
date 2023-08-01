class BrickRunner{
public static void main(String[] info)
{
Brick brick=new Brick(5000,5);
System.out.println(brick.price);
System.out.println(brick.durability);
System.out.println(brick.colour);
System.out.println(brick.timeToMake);
Brick.colour="yellow";
Brick.timeToMake="6-7 hours";
System.out.println(brick.colour);
System.out.println(brick.timeToMake);

System.out.println("=========================");

Brick brick1=new Brick(3000,2);
System.out.println(brick1.price);
System.out.println(brick1.durability);
System.out.println(brick1.colour);
System.out.println(brick1.timeToMake);
Brick.colour="green";
Brick.timeToMake="9-10 hours";
System.out.println(brick.colour);
System.out.println(brick.timeToMake);
}
}