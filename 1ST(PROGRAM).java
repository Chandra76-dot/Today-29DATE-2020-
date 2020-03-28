public class CalculateSal {

	public static void main(String[] args) {
		
		int salary=8001,shifts=0,savings=0;
		if(salary>8000)
		{
			System.out.println("Salary too large");
			
		}
		else if(shifts<0)
		{
			System.out.println("Shifts too small");
		}
		else if(salary<0)
		{
			System.out.println("Salary too small");
		}
		else
		{
			savings=CalculateSal(salary,shifts);
			System.out.println(savings);
		}

	}

	private static int CalculateSal(int salary, int shifts) {
		double savings=0;
		 savings = (salary*0.5)+(salary*0.02*shifts);
		
		return 0;
	}

}
