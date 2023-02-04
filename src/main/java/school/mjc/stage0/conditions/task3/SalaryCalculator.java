package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double newSalary = salary;

        if (salary<= 0){
            System.out.println("wrong input!");


        } else if (salary < 10000){
            newSalary -= (salary * 0.15);
            System.out.println(newSalary);
        } else if (10000 < salary && salary <= 20000){
            newSalary -= (salary * 0.18);
            System.out.println(newSalary);
        } else{
            newSalary -= (salary * 0.2);
            System.out.println(newSalary);
        }
    }
}
