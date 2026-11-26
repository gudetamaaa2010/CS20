
		package Mastery;

		public class Num 
	{
			//declare private variable
			private int number;
	  
			//create new num object
			public Num(int n) 
	{
	        number = n;
	}

			//returns the whole stored integer
			public int getWhole() 
	{
	        return number;
	}

			//returns the ones place
			public int getOnes() 
	{
	        return number % 10;
	}
			//returns the tens place
			public int getTens() 
	{
	        return (number / 10) % 10;
	}

			//returns the hundreds place
			public int getHundreds() 
	{
	        return (number / 100) % 10;
	}
	}



