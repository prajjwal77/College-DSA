package DSAPrep;

public class PrimeNumber {
	public static void main(String[] args) {
		int flag = 0;
		  System.out.println("Prime numbers between 1 to "+100+" are ");
			for(int j=2;j<=100;j++)
			{
			int count = 0;
			for(int i=1;i<=j;i++)
			{
			   if(j%i==0)
			   {
			        count++;        
			   }
			}
			if(count==2)
			       System.out.print(j+"  ");     
			}
			
	}
}
