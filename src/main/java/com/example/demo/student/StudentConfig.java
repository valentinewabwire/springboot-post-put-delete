package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Miriam",
                    "Miriam@pes.co.ke",
                    LocalDate.of(2000, APRIL,5)
            );

            Student Kamau = new Student(
                    "Kamau",
                    "kamau@pes.co.ke",
                    LocalDate.of(1997, APRIL,12)
            );

            repository.saveAll(
                    List.of(mariam,Kamau)
            );
        };
    }
}
