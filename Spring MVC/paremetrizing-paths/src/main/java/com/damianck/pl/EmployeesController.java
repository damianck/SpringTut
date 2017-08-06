package com.damianck.pl;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("employees")
@RestController
public class EmployeesController {
    @RequestMapping(value = "/getEmployees", method = RequestMethod.POST)
    //@PostMapping("getEmployees")
    //@RequestMapping(value = "/getEmployees", method = {RequestMethod.GET, RequestMethod.POST})
    public List<Employee> getEmployee() {
        List<Employee> result = new ArrayList<>();

        result.add(new Employee("John", "Butters", new BigDecimal("1234.56")));
        result.add(new Employee("Steve", "Clussy", new BigDecimal("5223.12")));
        result.add(new Employee("Anne", "Cliston", new BigDecimal("3654.34")));

        return result;
    }

    @RequestMapping(value = "findAny", method = RequestMethod.GET)
    //@GetMapping("findAny")
    public Employee findAny() {
        return new Employee("Steve", "Clinton", new BigDecimal("5555.55"));
    }
}
