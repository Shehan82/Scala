object q4
{
	def main(args: Array[String])
	{
		isEvenOrOdd(5);
	}
	
	def isEvenOrOdd(n:Int):Unit= n match
	{
		case x if(n==0) => println("Even")
		case x if(n==1) => println("Odd")
		case x => isEvenOrOdd(n-2)
	}
}