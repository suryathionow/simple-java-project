package people;

public class SoftwareEngineer extends Employee {

	public int age;
	public int cOff;

	public SoftwareEngineer(String name, String id, int age, int yearJoined){
		this.name = name;
		this.id = id;
		this.age = age;
		this.yearJoined = yearJoined;
		System.out.println("Software Engineer have been successfully created with the data:");
		System.out.println("Name: "+ name);
		System.out.println("Id  : "+ id);
		System.out.println("Age : "+ age);
		System.out.println("Year Joined : "+ yearJoined);
	}
	
	@Override
	public long getSalary() {
		long seSalary = super.getSalary() + 1300000;
		return seSalary;
	}

	@Override
	public long getTotalSalary(){
		long totalSalary = getSalary() + getBonus() - getDeductedSalary();
		return totalSalary;
	}

	public void setCOff(int cOff){
		this.cOff = cOff;
	}

	public int getcOff(){
		return cOff;
	}

	@Override
	public int getAnnualLeave(){
		int annualLeave = super.getAnnualLeave() - getcOff();
		return annualLeave;
	}
}
