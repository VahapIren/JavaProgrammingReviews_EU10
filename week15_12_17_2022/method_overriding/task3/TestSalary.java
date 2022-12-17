package week15_12_17_2022.method_overriding.task3;

public class TestSalary {
    public static void main(String[] args) {
        Employee employee=new Employee();
        System.out.println(employee.salary());

        Manager manager=new Manager();
        System.out.println(manager.salary());

        Clerk clerk=new Clerk();
        System.out.println(clerk.salary());
    }
}
