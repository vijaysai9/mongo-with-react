package com.sample.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class Application implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    private Application(EmployeeRepository repository){
        this.repository=repository;
    }


    @Override
    public void run(String... args) throws Exception {

          this.repository.save(new Employee("vijay","abc","xyz"));

//        repository.deleteAll();
//
//        // TO save Employee DEtails
//        repository.save(new Employee("Alice", "Smith"));
//        repository.save(new Employee("Bob", "Smith"));
//
//        // for Fetching Employee Detials
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        for (Employee employee : repository.findAll()) {
//            System.out.println(employee);
//        }
//        System.out.println();
//
//        // To Fetch an individual Employee
//        System.out.println("Customer found with findByFirstName('Alice'):");
//        System.out.println("--------------------------------");
//        System.out.println(repository.findByFirstName("Alice"));
//
//        System.out.println("Customers found with findByLastName('Smith'):");
//        System.out.println("--------------------------------");
//        for (Employee employee : repository.findByLastName("Smith")) {
//            System.out.println(employee);
//        }

    }
}



