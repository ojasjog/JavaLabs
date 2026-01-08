public class PermanentEmployee extends Employee {

    private final double da;
    private final double basic;
    private final double hra;


    public PermanentEmployee(int empID, String empName, double basic, double hra, double da){
        super(empID, empName);

        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }
    @Override
    public double calculateSalary() {
        double f = basic+hra+da;
        System.out.println("The salary of the Permanent Employee is "+ f);
        return f;
    }
}
