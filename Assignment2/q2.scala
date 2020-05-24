object q2
{
	def main(args : Array[String])
	{
		println("Ticket price is 20 profit is : " + profit(20));
		println("Ticket price is 15 profit is : " + profit(15));
		println("Ticket price is 25 profit is : " + profit(25));
		println("Ticket price is 30 profit is : " + profit(30));
	}


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