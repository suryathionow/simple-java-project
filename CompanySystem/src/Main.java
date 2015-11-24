import people.QAEngineer;
import people.SoftwareEngineer;

public class Main {

	public static void main(String[] args) {
/**		QAEngineer mark = new QAEngineer("Mark", "ID1", 32);
		mark.setTotalAbsence(3);

		QAEngineer brian = new QAEngineer("Brian", "ID3", 38);

		brian.setTotalAbsence(10);

		System.out.println(mark.getTotalSalary());
		System.out.println(brian.getTotalSalary()); **/

		QAEngineer adi = new QAEngineer("Adi", "001", 20, 2);
		adi.setCOff(4);
		adi.setTotalAbsence(5);
		System.out.println("Salary: "+adi.getSalary() );
		System.out.println("Bonus: "+adi.getBonus() );
		System.out.println("Deducted Salary: "+adi.getDeductedSalary() );
		System.out.println("Total Salary: "+adi.getTotalSalary() );
		System.out.println("Total available C-Off: "+adi.getAnnualLeave() );

		System.out.println("---------------------------------------------------");

		SoftwareEngineer badi = new SoftwareEngineer("Badi", "002", 27, 3);
		badi.setCOff(8);
		badi.setTotalAbsence(2);
		System.out.println("Salary: "+badi.getSalary() );
		System.out.println("Bonus: "+badi.getBonus() );
		System.out.println("Deducted Salary: "+badi.getDeductedSalary() );
		System.out.println("Total Salary: "+badi.getTotalSalary() );
		System.out.println("Total available C-Off: "+badi.getAnnualLeave() );

	}
}
