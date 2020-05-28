object q1
{
	def main(args: Array[String])
	{
		println(isPrime(971));
		println(isPrime(13));
		println(isPrime(1));

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
}