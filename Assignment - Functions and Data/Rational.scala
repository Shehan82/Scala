object Rational
{
	def main(args: Array[String])
	{
		val x = new Rational(3, 4)
		val y = new Rational(5, 8)
		val z = new Rational(2,7)
		// println(x.add(y))
		// println(x.neg)

		val r = x.sub(y)
		val t = r.sub(z)
		

		println(t)
	}
}
	

//Q1
class Rational(x:Int, y:Int)
	{
		def numer = x
		def denom = y

		def +(r:Rational) = 
		{
			new Rational(this.numer *r.denom +r.numer * this.denom, denom * r.denom)
		}

		def neg = new Rational(-this.numer,this.denom)

		def -(r:Rational) = this+r.neg


		//Q2
		def sub(r: Rational) =
		{
			new Rational(numer*r.denom - r.numer*denom, denom*r.denom)
		}

		override def toString = numer + "/" + denom
	}

