//NOTE: This is one way to get to the final solution. There are others!
public class Payroll {

	public static void main(String[] args) {
		/* This is the main method.
		 * In order to write other methods in this
		 * specific class, you must put "static" in front
		 * of the signature. For example, the payroll()
		 * method's signature would look like
		 * static String payroll()
		 */
		
		/*NOTE: String means that the method will return a
		 * String, meaning when you run the method it will
		 * output a String once it is complete.
		 * A String is any collection of chars 
		 * (can be all letters and numbers, most symbols), typically
		 * more than 2 in a String. You ALWAYS write Strings 
		 * in between 2 quotation marks.*/
		System.out.println(payroll());
	}
	
	static String payroll() {
		
		//Begin declaration of given variables
		double hours = 8; //hours worked
		double payment = 200; //amount paid per hour
		double fedTaxRate = 0.2; //Federal Tax of 20%
		double stateTaxRate = 0.06; //State Tax of 6%
		double ficaRate = 0.05; //Social Security (FICA) collects 5%
		//End declaration of given variables
		
		//Begin declaration of unknown variables
		double pay = 0; //initial value of regular pay
		double overTime = 0; //initial value of over time pay
		double grossPay = 0; //initial value of gross pay
		double fedTax = 0; //initial value of federal tax
		double stateTax = 0; //initial value of state tax
		double fica = 0; //initial value of social security, aka FICA
		double net = 0; //initial value of net pay
		//End declaration of variables
		
		//Begin modification of variables
		pay = hours*payment; //sets regular pay to amount of hrs times rate/hr
		if(hours>=40) { //if they worked 40 hrs or more
			overTime = ((hours-40)*1.5)*payment;
		}
		grossPay = pay+overTime; //sets gross pay to regular pay plus over time
		fedTax = grossPay*fedTaxRate; //sets federal tax to gross pay times the tax rate
		stateTax = grossPay*stateTaxRate; //sets state tax to gross times state tax rate
		fica = grossPay*ficaRate; //sets FICA to gross times FICA rate
		net = grossPay-fedTax-stateTax-fica; //sets net pay to all taxes and FICA subtracted from gross
		//End modification of variables
		
		//Begin return statement
		//NOTE: "\n" results in the command prompt going to the next line
		return "Regular pay: $"+pay+"\nOver Time: $"+overTime+"\nGross Pay: $"+grossPay+
				"\nFederal Tax: $"+fedTax+"\nState Tax: $"+stateTax+"\nFICA: $"+fica+
				"\n*************************************"+"\nNet Pay: $"+net;//outputs string
		//End return statement
	}

}