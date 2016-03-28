package Roman_Numeral;



public class RomanNumeral {


	public String convertNumberToNumeral(int input) {
		String romanOnes = ("");
		String romanTens = ("");
		String romanHundreds = ("");
		String romanThousands = ("");
		int ones, tens, hundreds, thousands;

		int tempVariable = input;
		ones = tempVariable % 10;

		tempVariable = input / 10;
		tens = tempVariable % 10;

		tempVariable = input / 100;
		hundreds = tempVariable % 10;

		tempVariable = input / 1000;
		thousands = tempVariable % 10;

		System.out.println(ones + "  "+ romanOnes);
		romanOnes = calculateOnes(ones);
		romanTens = calculateTens(tens);
		romanHundreds = calculateHundreds(hundreds);
		romanThousands = calculateThousands(thousands);
		//System.out.println(thousands + "  1000 "+ romanThousands);
		//System.out.println(hundreds + "  100 "+ romanHundreds);
		//System.out.println(tens + " 10 "+ romanTens);
		//System.out.println(ones + " 0 "+ romanOnes);

		return romanThousands+romanHundreds+romanTens+romanOnes;
	}

	private String calculateOnes(int number)
	{
		String romanResult = "";
		if (number == 0)
		{
			romanResult = ("");
		}
		else if (number == 1)
		{
			romanResult = ("I");
		}
		else if (number == 2)
		{
			romanResult = ("II");
		}
		else if(number == 3)
		{
			romanResult = ("III");
		}
		else if(number == 4)
		{
			romanResult = ("IV");
		}
		else if(number == 5)
		{
			romanResult = ("V");
		}
		else if(number == 6)
		{
			romanResult = ("VI");
		}
		else if(number == 7)
		{
			romanResult = ("VII");
		}
		else if(number == 8)
		{
			romanResult = ("VIII");
		}
		else if(number == 9)
		{
			romanResult = ("IX");
		}
		return romanResult;
	}

	private String calculateTens(int number)
	{
		String romanResult = "";
		if (number == 0)
		{
			romanResult = ("");
		}
		else if (number == 1)
		{
			romanResult = ("X");
		}
		else if (number == 2)
		{
			romanResult = ("XX");
		}
		else if(number == 3)
		{
			romanResult = ("XXX");
		}
		else if(number == 4)
		{
			romanResult = ("XL");
		}
		else if(number == 5)
		{
			romanResult = ("L");
		}
		else if(number == 6)
		{
			romanResult = ("LX");
		}
		else if(number == 7)
		{
			romanResult = ("LXX");
		}
		else if(number == 8)
		{
			romanResult = ("LXXX");
		}
		else if(number == 9)
		{
			romanResult = ("XC");
		}
		return romanResult;
	}
	private String calculateHundreds(int number)
	{
		String romanResult = "";
		if (number == 0)
		{
			romanResult = ("");
		}
		else if (number == 1)
		{
			romanResult = ("C");
		}
		else if (number == 2)
		{
			romanResult = ("CC");
		}
		else if(number == 3)
		{
			romanResult = ("CCC");
		}
		else if(number == 4)
		{
			romanResult = ("CD");
		}
		else if(number == 5)
		{
			romanResult = ("D");
		}
		else if(number == 6)
		{
			romanResult = ("DC");
		}
		else if(number == 7)
		{
			romanResult = ("DCC");
		}
		else if(number == 8)
		{
			romanResult = ("DCCC");
		}
		else if(number == 9)
		{
			romanResult = ("CM");
		}
		return romanResult;
	}

	private String calculateThousands(int number)
	{
		String romanResult = "";
		if (number == 0)
		{
			romanResult = ("");
		}
		else if (number == 1)
		{
			romanResult = ("M");
		}
		else if (number == 2)
		{
			romanResult = ("MM");
		}
		else if(number == 3)
		{
			romanResult = ("MMM");
		}
		return romanResult;
	}}
	

