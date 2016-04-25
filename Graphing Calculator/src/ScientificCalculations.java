
public class ScientificCalculations
{

	public static double evaluate(String operationType, double par1,
			double par2)
	{

		switch (operationType)
		{
		case "sin":
			return sin(par1);
		case "cos":
			return cos(par1);
		case "tan":
			return tan(par1);
		case "ln":
			return ln(par1);
		case "log":
			return log(par1);
		case "factorial":
			// return factorial((int) par1);
		case "power":
			return power(par1, par2);
		case "squareRoot":
			return squareRoot(par1);
		case "add":
			return add(par1, par2);
		case "subtract":
			return subtract(par1, par2);
		case "divide":
			return divide(par1, par2);
		case "multiply":
			return multiply(par1, par2);
		case "inverseSin":
			return inverseSin(par1);
		case "inverseCos":
			return inverseCos(par1);
		case "inverseTan":
			return inverseTan(par1);
		case "tenToTheX":
			return tenToTheX(par1);
		case "eToTheX":
			return eToTheX(par1);
		case "sqaured":
			return sqaured(par1);
		}
		System.err.println("operation type unrecognized");
		return 0;

	}

	// first variable
	// operation
	// second variable
	// answer
	// answer become first variable and repeat

	static public double sin(double par1)
	{
		return Math.sin(par1);

	}

	static public double cos(double par1)
	{
		return Math.cos(par1);

	}

	static public double tan(double par1)
	{
		return Math.tan(par1);

	}

	static public double ln(double par1)
	{
		return Math.log(par1);

	}

	static public double log(double par1)
	{
		return Math.log10(par1);

	}

	/*
	 * static public double factorial(int par1) { if (par1 == 1) { return 1;
	 * 
	 * } else { return par1 * factorial(par1 - 1); }
	 * 
	 * }
	 */

	static public double power(double par1, double par2)
	{
		return Math.pow(par1, par2);

	}

	static public double squareRoot(double par1)
	{
		return Math.sqrt(par1);

	}

	static public double add(double par1, double par2)
	{
		return (par1 + par2);

	}

	static public double subtract(double par1, double par2)
	{
		return (par1 - par2);

	}

	static public double divide(double par1, double par2)
	{
		return (par1 / par2);

	}

	static public double multiply(double par1, double par2)
	{
		return (par1 * par2);

	}

	static public double inverseSin(double par1)
	{
		return Math.asin(par1);

	}

	static public double inverseCos(double par1)
	{
		return Math.acos(par1);

	}

	static public double inverseTan(double par1)
	{
		return Math.atan(par1);

	}

	static public double tenToTheX(double par1)
	{
		return Math.pow(10, par1);

	}

	static public double eToTheX(double par1)
	{
		return Math.pow(Math.E, par1);

	}

	static public double sqaured(double par1)
	{
		return Math.pow(par1, 2);

	}

}
