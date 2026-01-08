public class EmployeePayroll {

    public static void main(String[] args){
        Employee e1 = new PermanentEmployee(101, "John", 4.6, 5.9, 2.5);
        Employee e2 = new ContractWorker(102, "Jacob", 6.7, 9);

        e1.calculateSalary();
        e2.calculateSalary();


    }

}
