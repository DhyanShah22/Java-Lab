class employee {
    private String eName;
    private int basicSalary;
    private static int employeeCount = 0;

    public employee(){
        this.eName = "";
        this.basicSalary = 0;
        employeeCount++;
    }
    public employee(String name, int bs){
        this.eName = name;
        this.basicSalary= bs;
        employeeCount++;
    }
    public employee(employee e){
        this.eName = e.eName;
        this.basicSalary = e.basicSalary;
        employeeCount++;
    }
    public String getName(){
        return eName;
    }
    public int getSalary() {
        return basicSalary;
    }
    public void setName(String eName){
        this.eName = eName;
    }
    public void setSalary(int basicSalary){
        this.basicSalary = basicSalary;
    }
    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Income: " + getNetIncome());
    }
    public int getNetIncome() {
        return basicSalary;
    }
    public static int countEmployees(){
        return employeeCount;
    }
}
    class SalesManager extends employee {
        private int salesAmount;
        public SalesManager() {
            super();
            this.salesAmount = 0;
        }
        public SalesManager(String name, int bs, int sa){
            super(name, bs);
            this.salesAmount = sa;
        }
    
        public void printEmployeeDetails() {
            super.printEmployeeDetails();
            System.out.println("Sales Amount: " + salesAmount);
        }
        public int getNetIncome() {
            int commission = (int) (0.1 * salesAmount);
            return super.getSalary() + commission;
        }
        public static int countEmployees(){
            return employee.countEmployees();
        }
    }
    public class PayrollManagementSystem {
        public static void main(String args[]){
            employee emp1 = new employee("Dhyan", 100000000);
            SalesManager smr1 = new SalesManager("Kartik", 5000000, 6000000);
            System.out.println("Employee Details");
            emp1.printEmployeeDetails();
            System.out.println("Sales Manager Details");
            smr1.printEmployeeDetails();
            System.out.println("\n Total Employees: " + employee.countEmployees());
        }
    }