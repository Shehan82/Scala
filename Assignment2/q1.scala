object q1
{
	def main(args : Array[String])
	{
		println(takehomesal(40,20));

	}


	def normal(h1:Int)=
	{
		h1*150
	}

	def ot(h2:Int)=
	{
		h2*75
	}

	def tax(h1:Int,h2:Int):Double=
	{
		0.1*normal(h1) + 0.1*ot(h2)
	}


	def takehomesal(h1:Int,h2:Int):Double=
	{
		normal(h1) + ot(h2)- tax(h1,h2)
	}

	

}