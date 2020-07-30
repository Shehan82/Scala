object Bank
{
	def main(args: Array[String])
	{
		val acc1 = new Account("123",001,-989)
		val acc2 = new Account("456",002,34900)
		val acc3 = new Account("789",003,13000)

		var bank:List[Account]=List(acc1, acc2, acc3)


		//Q3
		println("\nBefore transaction acc3 : "+acc3)
		println("Before transaction acc2 : "+acc2)

		acc3.transfer(acc2, 5000)

		println("\nAfter transaction acc3 : "+acc3)
		println("After transaction acc2 : "+acc2)

		
		//Q4.1
		val checkNegative = (l:Account)=> l.balance < 0
		val overdraft = (b:List[Account]) => b.filter(checkNegative)
		println("\nList of account with negative balance : "+overdraft(bank));

		
		// val sum = (x:Double,y:Double)=> x+y
		// val balance = (b:List[Double])=> b.reduce(sum)
		// val li = bank.map(x=>x.balance)
		// println("\nSum of all account balances :"+balance(li))

		//Q4.2
		val Balance=(b:List[Account])=>b.reduce((x,y)=>(new Account(x.nic,x.accNum, x.balance+y.balance)))
 	    println("\nSum of all account balances :"+Balance(bank).balance)


 	    //Q4.3
		val interest=(b:List[Account])=>
		{
			if(overdraft(b)==true)
				b.map(x => x.balance - x.balance*0.1)
			else
				b.map(x => x.balance*0.05+x.balance)
		}
		
		println("\nbalances of all accounts after apply the interest :"+interest(bank))
	
	
		
	}
}
	


class Account(id:String, n:Int, b:Double)
	{
		val nic:String = id
		val accNum: Int = n
		var balance: Double = b

		def withdraw(a:Double) = this.balance=this.balance-a

		def deposit(a:Double) = this.balance=this.balance+a

		def get() =
		{
			this.balance
		}

		//Q3
		def transfer(a:Account,b:Double)=
		{
			//this.balance=this.balance-b
			this.withdraw(b)
			a.deposit(b)
		}

		override def toString = "["+nic+":"+accNum +":"+ balance+"]"
	}