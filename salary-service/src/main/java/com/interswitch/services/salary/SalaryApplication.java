package com.interswitch.services.salary;

import com.interswitch.services.salary.model.Salary;
import com.interswitch.services.salary.repository.SalaryRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info =
@Info(title = "Salary API", version = "1.0", description = "Documentation Salary API v1.0")
)
public class SalaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalaryApplication.class, args);
    }

    @Bean
    SalaryRepository repository() {
        SalaryRepository repository = new SalaryRepository();
        LocalDate date1 = getDate("2022-04-13");
        LocalDate date2 = getDate("2022-05-13");
        LocalDate date3 = getDate("2022-06-13");
        repository.add(new Salary(1L, 1L, BigDecimal.valueOf(123.0), date1));
        repository.add(new Salary(2L, 2L, BigDecimal.valueOf(3092.0), date2));
        repository.add(new Salary(3L, 3L, BigDecimal.valueOf(1009.0), date3));
        repository.add(new Salary(4L, 4L, BigDecimal.valueOf(937.0), date2));
        repository.add(new Salary(5L, 5L, BigDecimal.valueOf(773.0), date1));
        repository.add(new Salary(6L, 6L, BigDecimal.valueOf(1211.0), date3));
        repository.add(new Salary(7L, 7L, BigDecimal.valueOf(209.0), date3));
        repository.add(new Salary(8L, 8L, BigDecimal.valueOf(4087.0), date2));

        return repository;
    }

        private LocalDate getDate(String date){
            return LocalDate.parse(date); // Using "yyyy-MM-dd" format

    }
}