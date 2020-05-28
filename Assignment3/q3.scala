object q3
{
	def main(args: Array[String])
	{
		println(sum(10));
	}

	def sum(n:Int,p:Int=1,t:Int=1):Int= n match
	{
		case x if(p==n) => t
		case x => sum(x,p+1,t+p+1)
	}
	
}