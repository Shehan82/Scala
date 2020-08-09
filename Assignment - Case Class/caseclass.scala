import scala.math.sqrt
import scala.math.pow


object caseclass
{


	def main(args: Array[String])
	{
		val p = Point(6,4)
		val t = Point(2,1)
		
		val add = p.add(t)
		println(add)

		val move = p.move(4)
		println(move)

		val distance = p.distance(t)
		println(distance)

		val invert = p.invert()
		println(invert)

		

	}


	case class Point(x:Int,y:Int)
	{
		def a:Int = x
		def b:Int = y

		def add(p:Point)=
		{
			Point(this.a + p.a , this.b + p.b)
		}

		def move(d:Int)={

			Point(this.a*d, this.b*d)
		}

		def distance(p:Point):Double={

			return sqrt(pow(this.a-p.a,2) + pow(this.b - p.b,2))
		}

		def invert()={

			Point(this.b , this.a)
		}


	}
}