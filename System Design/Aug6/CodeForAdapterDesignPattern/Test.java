package CodeForAdapterDesignPattern;

public class Test {

	public static void main(String[] args) {
		EmployeeDetails ds = new EmployeeDetails();
		EmployeeToPLAdapter adapter = new EmployeeToPLAdapter(ds); // EmployeeToPLAdapter apn khud bnate he baki saari classes(iphone, intra, employeedetail) bni hui hoti he pehle se hi EmployeeToPLAdapter ki jagah StudenToPLAdapter bhi use kr sakte he
		Intranet intra = new Intranet(adapter); //interface ki jagah uski implemented class ko bhi use kr sakte he
		
		intra.printPhoneNumbers();
	}

}
