class CandleRunner{
	
public static void main(String[] args)
{
	
	Candle candle=new Candle(1,20);
	System.out.println(candle.duration);
	System.out.println(candle.price);
	System.out.println(candle.specification);
	System.out.println(candle.shape);
	candle.specification="lightning";
	candle.shape="round";
	System.out.println(candle.specification);
	System.out.println(candle.shape);
	
	System.out.println("===================");
	
	Candle candle1=new Candle(5,250);
	System.out.println(candle1.duration);
	System.out.println(candle1.price);
	System.out.println(candle1.specification);
	System.out.println(candle1.shape);
	candle.specification="burning";
	candle.shape="short";
	System.out.println(candle.specification);
	System.out.println(candle.shape);
}
}