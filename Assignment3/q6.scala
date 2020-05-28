object q6
{
	def main(args: Array[String])
	{
		fibSeq(10);
	}
	
	def fib(n:Int):Int= n match
	{
		case x if(x==0) => 0
		case x if (x==1) => 1
		case x => fib(x-1)+fib(x-2)
	}

	def fibSeq(n:Int):Unit= 
	{
		if (n > 0)
		{
			fibSeq(n-1)
		} 		

		print(fib(n)+ " ")
	}

}