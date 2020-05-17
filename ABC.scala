object ABC
{
	def main(args: Array[String])
	{
		
		println(Fahrenheit(35));
		println(Area(5));
		println(wholeSaleCost(60));
	}
	//q1

	def Fahrenheit(c:Double):Double=
	{
		c*1.8000 + 32
	}

	//q2

	def Area(r:Double)=
	{
		r*r*math.Pi
	}

	//q3

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