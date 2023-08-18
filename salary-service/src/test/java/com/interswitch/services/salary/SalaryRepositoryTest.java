package com.interswitch.services.salary;

import com.interswitch.services.salary.model.Salary;
import com.interswitch.services.salary.repository.SalaryRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.util.Assert;

import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SalaryRepositoryTest {

//    private static final SalaryRepository repository = new SalaryRepository();
//
//    @Test
//    @Order(1)
//    void testAddSalary() {
//        Salary salary = new Salary(1L, 100.00);
//        salary = repository.add(salary);
//        Assert.notNull(salary, "Salary is not null.");
//        Assert.isTrue(salary.getEmployeeId() == 1L, "Salary bad id.");
//    }
//
//    @Test
//    @Order(2)
//    void testFindAll() {
//        List<Salary> salaries = repository.findAllSalary();
//        Assert.isTrue(salaries.size() == 1, "Departments size is wrong.");
//        Assert.isTrue(salaries.get(0).getEmployeeId() == 1L, "Salary bad id.");
//    }
//
//    @Test
//    @Order(3)
//    void testFindById() {
//        List<Salary> salaries = (List<Salary>) repository.findSalaryById(1L);
//        Assert.notNull(salaries, "Salary not found.");
//        Assert.isTrue(salaries.size() == 1, "Salary bad id.");
//    }
//
//    @Test
//    @Order(4)
//    void testSetDepartmentByEmployee() {
//        Salary salary = new Salary(2L, 120.00);
//        Salary salary1 = new Salary(2L, 200.00);
//        Salary salary2 = new Salary(3L, 50.00);
//        repository.add(salary);
//        repository.add(salary1);
//        repository.add(salary2);
//
//        assumingThat(repository.findAllSalary().stream()
//                        .anyMatch(s-> s.getEmployeeId()==2L),
//                ()->repository.addDepartmentIdToSalary(2L, 2L));
//        assertAll("Department Exist",
//                ()->assertThat(repository.findByEmployee(2L).size()).isEqualTo(2),
//                ()->assertThat(repository.findByEmployee(2L).stream()
//                        .findAny().get().getDepartmentId()).isEqualTo(2)
//        );
//
//
//    }
}
