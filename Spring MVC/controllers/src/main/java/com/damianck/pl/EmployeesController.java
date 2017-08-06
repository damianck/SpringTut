package com.damianck.pl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
public class EmployeesController {
    @RequestMapping("getEmployees")
    @ResponseBody
    public List<Empoloyee> getEmployee() {
        List<Empoloyee> result = new ArrayList<>();

        result.add(new Empoloyee("John", "Butters", new BigDecimal("1234.56")));
        result.add(new Empoloyee("Steve", "Clussy", new BigDecimal("5223.12")));
        result.add(new Empoloyee("Anne", "Cliston", new BigDecimal("3654.34")));

        return result;
    }
}
