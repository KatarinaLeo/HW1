import java.util.Arrays;

/**
 * Java 1. Homework 5
 *
 * @author Leonskaya Ekaterina
 * @version 20.10.2021
 */

public class Homework5 {

    public static void main(String[] args){
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivan Ivanov", "manager", "iivanov@mail.ru", "89021112233",56675.00,
                37);
        employeeArray[1] = new Employee("Nikita Ivanov", "manager", "nivanov@mail.ru", "89021112234",57675.00,
                28);
        employeeArray[2] = new Employee("Ivan Petrov", "manager", "ipetrov@mail.ru", "89027112233",76675.00,
                32);
        employeeArray[3] = new Employee("Petr Petrov", "manager", "ppetrov@mail.ru", "89024112239",76675.00,
                31);
        employeeArray[4] = new Employee("Ivan Nikitin", "manager", "inikitin@mail.ru", "89021112783",96675.00,
                41);

        for(int i = 0; i < employeeArray.length; i++){
            if(employeeArray[i].getAge() > 40){
                System.out.println(employeeArray[i]);
            }
        }
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private double salary;
    private int age;


    Employee(String name, String position, String email, String telephone, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return name + ", " + position + ", " + email + ", " + telephone + ", " + salary + ", " + age;
    }

    int getAge(){
        return age;
    }

}
