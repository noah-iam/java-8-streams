package java8;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {
    public static void main(String[] args) {
        //optionalOf();
       // optionalOfNullAble();
        //optionalOfMapOrElse();
        optionalOfMapOrElseGet();
    }

    private static void optionalOf() {
        Optional<Employee> optionalEmployee = Optional.of(LamdaExample.getEmployees().get(0));

        if(optionalEmployee.isPresent())
        System.out.println(optionalEmployee.get());

        else
            System.out.println("Employee not found");
    }

    private static void optionalOfNullAble() {
        Optional<Employee> optionalEmployee = Optional.ofNullable(null);
        // OptionalOfNullable will handle the null condition also
        if(optionalEmployee.isPresent())
            System.out.println(optionalEmployee.get());

        else
            System.out.println("Employee not found");
    }

    private static void optionalOfMapOrElse() {
        Optional<Employee> optionalEmployee = Optional.of(LamdaExample.getEmployees().get(0));
        // OptionalOfNullable will handle the null condition also
        System.out.println(optionalEmployee.map(Employee::getSalary).orElse(0));
    }

    private static void optionalOfMapOrElseGet() {
        Optional<Employee> optionalEmployee = Optional.of(LamdaExample.getEmployees().get(0));
        // OptionalOfNullable will handle the null condition also
        System.out.println(optionalEmployee.map(Employee::getSalary).orElseGet(() -> 50));
    }
}
