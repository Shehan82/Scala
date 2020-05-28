object q2
{
	def main(args: Array[String])
	{
		printPrime(1000);
		

	}

	// def divide(a:Int,b:Int=2):Boolean= b match
	// {
	// 	case x if(a!=x && a%x==0) => false
	// 	case x if(a<=x) => true
	// 	case x => divide(a,x+1)
	// }

	// def isPrime(p:Int):Boolean=p match 
	// {
	// 	case x if(x==2) => true
	// 	case x if(x==1) => false
	// 	case x => divide(x) 
	// }

	def gcd(n:Int,t:Int):Int=t match
	{
		case 0 => n
		case x if(x>n) => gcd(x,n)
		case x => gcd(x,n%x)
	}
	def isPrime(a:Int,b:Int=2):Boolean= b match 
	{
		case x if(a==1) => false
		case x if(x==a) => true
		case x if gcd(a,x)>1 => false
		case x => isPrime(a,x+1)
	}

	def printPrime(r:Int,n:Int=2):Unit=
	{

		// if(isPrime(n))
		// {
		// 	print(n + " ");
		// }

		// if(n>=r)
		// {
		// 	return 0;
		// }

		// printPrime(r,n+1)

		if(r>=n)
		{
			if(isPrime(n))
			{
				print(n + " ");
			}

			printPrime(r,n+1)

		}
	} 
}