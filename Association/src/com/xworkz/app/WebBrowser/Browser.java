package WebBrowser;

public class Browser {
		public String name="youtube";
		public int price=3873;
		public Internet run=new Internet();

		public void insta()
		{
			if(run!=null)
			{
				System.out.println("There is no null value");
				this.run.Viedoes();
			}
			else {
				System.out.println("Fix the null value");
			}
		}
}