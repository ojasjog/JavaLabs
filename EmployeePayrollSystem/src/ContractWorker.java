public class ContractWorker extends Employee{
    double hourlyRate;
    int hoursWorked;
    public ContractWorker(int empID, String empName, double hourlyRate, int hoursWorked){
        super(empID, empName);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        double g = hourlyRate * hoursWorked;
        System.out.println("The salary of the Contract Worker " + empName + " is " + g);
        return 0;
    }
}
