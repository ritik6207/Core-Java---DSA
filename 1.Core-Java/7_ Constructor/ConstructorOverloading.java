class Employees
{
    private String name;
    private int employId;
    private String departmentName;
    public Employees()
    {
        System.out.println("Default Constructor");
        System.out.println("EmployeeName" + " " + "EmployeeId" + " " + "DepartmentName");
        name = "Ritik";
        employId = 91;
        departmentName = "ECE";
    }

    public Employees(String name)
    {
        this.name = name;
        employId = 231;
        departmentName = "Worker";
    }

    public Employees(String name, int employId)
    {
        this.name = name;
        this.employId = employId;
        departmentName = "Account worker";
    }

    public Employees(String name, int employId, String departmentName)
    {
        this.name = name;
        this.employId = employId;
        this.departmentName = departmentName;
    }

    public void disp()
    {
        System.out.println(name + " " + employId + " " + departmentName);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.disp();

        Employees e2 = new Employees("Mohan");
        e2.disp();

        Employees e3 = new Employees("Rajesh", 243);
        e3.disp();

        Employees e4 = new Employees("Rohit", 432, "Management");
        e4.disp();
    }
}
