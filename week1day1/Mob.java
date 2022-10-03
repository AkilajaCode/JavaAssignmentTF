package week1day1;

public class Mob {
	public void Makecall(String mobModel,float mobWeight)
	{
		System.out.println(mobModel);

		System.out.println(mobWeight);
		
		
		
	}
	public void Sendmsg(boolean isFullycharged,int mobCost)
	{
		System.out.println(isFullycharged);

		System.out.println(mobCost);	
		
		
	}
	public static void main(String []args)
	{
	Mob m=new Mob();
			m.Makecall("iphone14" ,172.0f);
			m.Sendmsg(true, 80000);
			System.out.println("This is my new mobile");

}
}
