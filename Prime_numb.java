package prime_number;
//what is prime number the number that is divide only by itself and 1(2,3,5.....)

public class Prime_numb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, m=0, flag=0;            //intializatio
		int n=3;                    
		m=n/2;                          //m=(3/2)=1.5
		if(n==0||n==1)                  //0 and 1 are not prime numbers
		{
			System.out.println(n+"is not prime number");
		}
		else
		{
			//2 should be minimam for prime 
			//like below 2 there is no prime nubers
			//condition for one that is not prime numbers
			//if given number divides by 2 and it shuld be graeter than 2
			for(i=2;i<=m;i++)            //i=2;2<=1.5;i++
			{
				//this for divide by any number it should not be reminder 0
				//if it divides=reminder=0=not prime
				if(n%i==0)               //3%2==0
				{
					System.out.println(n+ " is not prime number");
					flag=1;
					break;
				}
			}
			
			
			if(flag==0)
			{
				System.out.println(n+" is prime number");
			}
		}
		

	}

}
