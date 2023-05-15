package basictest.infra;
import basictest.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/employees")
@Transactional
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;




    @PutMapping("/employees/search/")
    public Object (@RequestBody EmployeeViewQuery query){
        return employeeRepository.(query.getUserId());
    }
}
