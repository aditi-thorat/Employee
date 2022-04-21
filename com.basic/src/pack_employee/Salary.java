package pack_employee;

public class Salary extends Employee {
private int BasicSal;
private int HRA;
private float TA;
private boolean IsOptedForNPS;

public Salary(String firstName, String lastName,int c, int d, float tA, boolean isOptedForNPS) {
	super(firstName, lastName);
	BasicSal = c;
	HRA = d;
	TA = tA;
	IsOptedForNPS = isOptedForNPS;
}
public int getBasicSal() {
	return BasicSal;
}
public void setBasicSal(int basicSal) {
	BasicSal = basicSal;
}
public int getHRA() {
	return HRA;
}
public void setHRA(int hRA) {
	HRA = hRA;
}
public float getTA() {
	return TA;
}
public void setTA(float tA) {
	TA = tA;
}
public boolean isIsOptedForNPS() {
	return IsOptedForNPS;
}
public void setIsOptedForNPS(boolean isOptedForNPS) {
	IsOptedForNPS = isOptedForNPS;
}

public void UpdateEmployeeDetails() {
	super.UpdateEmployeeDetails();
	System.out.println("EmployeeBasic"+BasicSal);
	System.out.println("EmployeeHRA"+HRA);
	System.out.println("EmployeeTA"+ TA);
	System.out.println("EmployeeNPS"+ IsOptedForNPS);
}
}
