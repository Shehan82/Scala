object q5
{
	def main(args: Array[String])
	{
		println(sumEven(7));
		
	}

	def isEven(n:Int):Boolean= n match
	{
		case x if(n==0) => true
		case x if(n==1) => false
		case x => isEven(n-2)
	}

	def sumEven(a:Int,p:Int=0,t:Int=2):Int=t match
	{
		case x if(a==x) => p
		case x if(isEven(x)==true) => sumEven(a,p+x,x+1)
		case x if(isEven(x)==false) => sumEven(a,p,x+1)
	}
	

}