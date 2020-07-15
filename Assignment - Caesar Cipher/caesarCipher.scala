object caesarCipher
{
	def main(args: Array[String])
	{
		

		val E = (letter:Char, key:Int, alp:String) => alp((alp.indexOf(letter.toUpper)+key)%alp.size)

		val D = (letter:Char, key:Int, alp:String) => {
			if((alp.indexOf(letter.toUpper)-key) < 0)
				alp((alp.indexOf(letter.toUpper)-key+alp.size)%alp.size)
			else
				alp((alp.indexOf(letter.toUpper)-key)%alp.size)
		}

		val cipher=(algorithm:(Char,Int,String)=> Char,s:String,key:Int,alp:String) => s.map(algorithm(_,key,alp))

		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		val s = "Helloworld"
		
		val ct=cipher(E,s,10,alphabet)
		val pt=cipher(D,ct,10,alphabet)

		print(ct)
		println(" ")
		println(pt)

		//println(D('a',5,alphabet))


	}
}