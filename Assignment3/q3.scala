object q3
{
	def main(args: Array[String])
	{
		println(sum(4));
	}

	def sum(n:Int,p:Int=0):Int=n match
	{
		case x if(x==0) => p
		case x => sum(n-1,p+n)
	}


	
}