package people;

public class QAEngineer extends Employee {
	
	public int age;
	public int cOff;

	/**
	 * Custom Constructor to create QAEngineer object.
	 * @param name its employees'name and it should be string
	 * @param id its employees'id and it should be string
	 * @param age its employees'age and it should be int
	 */

	public QAEngineer(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public QAEngineer(String name, String id, int age, int yearJoined){
		this.name = name;
		this.id = id;
		this.age = age;
		this.yearJoined = yearJoined;
		System.out.println("QAEngineer have been successfully created with the data:");
		System.out.println("Name: "+ name);
		System.out.println("Id  : "+ id);
		System.out.println("Age : "+ age);
		System.out.println("Year Joined : "+ yearJoined);
	}
	
	@Override
	public long getSalary() {
		long qaSalary = super.getSalary() + 1000000;
		return qaSalary;
	}
	
	@Override
	public long getTotalSalary() {
		long withBonus = getSalary() + getBonus() - getDeductedSalary();
		return withBonus;
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
