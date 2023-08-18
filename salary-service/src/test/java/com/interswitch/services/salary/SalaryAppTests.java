package com.interswitch.services.salary;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    properties = {
        "spring.cloud.discovery.enabled=false",
        "spring.cloud.config.discovery.enabled=false"
    }
)
public class SalaryAppTests {

//    @Autowired
//    TestRestTemplate restTemplate;
//    @MockBean
//    EmployeeClient employeeClient;
//
//    @Test
//    void findAll() {
//        Department[] departments = restTemplate.getForObject("/", Department[].class);
//        Assertions.assertTrue(departments.length > 0);
//    }
//
//    @Test
//    void findById() {
//        Department department = restTemplate.getForObject("/{id}", Department.class, 1L);
//        Assertions.assertNotNull(department);
//        Assertions.assertNotNull(department.getId());
//        Assertions.assertNotNull(department.getName());
//        Assertions.assertEquals(1L, department.getId());
//    }
//
//    @Test
//    void findByOrganization() {
//        Department[] departments = restTemplate.getForObject("/organization/{organizationId}", Department[].class, 1L);
//        Assertions.assertTrue(departments.length > 0);
//    }
//
//    @Test
//    void findByOrganizationWithEmployees() {
//        Mockito.when(employeeClient.findByDepartment(Mockito.anyLong()))
//                .thenReturn(Instancio.ofList(Employee.class).create());
//        Department[] departments = restTemplate.getForObject("/organization/{organizationId}/with-employees", Department[].class, 1L);
//        Assertions.assertTrue(departments.length > 0);
//    }
//
//    @Test
//    void add() {
//        Department department = Instancio.create(Department.class);
//        department = restTemplate.postForObject("/", department, Department.class);
//        Assertions.assertNotNull(department);
//        Assertions.assertNotNull(department.getId());
//        Assertions.assertNotNull(department.getName());
//    }
}
