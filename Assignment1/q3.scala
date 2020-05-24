object q3
{
	def main(args: Array[String])
	{
		println(wholeSaleCost(60));
	}
	

	def coverCost(n:Int):Double=
	{
		24.95*0.6*n
	}

	def shippingCost(n:Int):Double=
	{
		3*50 + 0.75*(n-50)
	}

	def wholeSaleCost(n:Int):Double=
	{
		coverCost(n) + shippingCost(n)
	}

}