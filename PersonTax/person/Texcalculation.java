package tns.newpackage.person;

public class Texcalculation {
	public void calculateTax(Person p)
	{
		double tax=0.00;
		if(p.getAge()>=18)
		{
			if(p.getIncome() >=50000 && p.getIncome() <=70000)
			{
				tax = p.getIncome()*0.05;
			}
			else if(p.getIncome() >=70000 && p.getIncome() <=100000)
			{
				tax = p.getIncome()*0.10;
			}
			else if(p.getIncome() >=100000 && p.getIncome() <=150000)
			{
				tax = p.getIncome()*0.15;
			}
			else
			{
				System.out.println("No Tax Because of low income");
			}
		}
		else
		{
			System.out.println("No Tax because of AGE");
		}
		System.out.println("Tax="+tax);
	}
}
