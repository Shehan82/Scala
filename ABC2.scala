object ABC2
{
	def main(args : Array[String])
	{
		println(takehomesal(40,20));

		println("Ticket price is 20 profit is : " + profit(20));
		println("Ticket price is 15 profit is : " + profit(15));
		println("Ticket price is 25 profit is : " + profit(25));
		println("Ticket price is 30 profit is : " + profit(30));
	}

	//q1

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

	//q2

	def people(t:Int)=
	{
		120 + (60 - 4*t)
	}

	def cost(t:Int)=
	{
		500 + 3*people(t)
	}

	def income(t:Int)=
	{
		t*people(t)
	}

	def profit(t:Int)=
	{
		income(t)-cost(t)
	}



}