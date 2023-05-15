package basictest.domain;

import basictest.BasicApplication;
import basictest.domain.EmployeeAdded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Employee_table")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private Boolean isManager;

    private String departmentId;

    private String rankId;

    @PostPersist
    public void onPostPersist() {
        EmployeeAdded employeeAdded = new EmployeeAdded(this);
        employeeAdded.publishAfterCommit();
    }

    public static EmployeeRepository repository() {
        EmployeeRepository employeeRepository = applicationContext()
            .getBean(EmployeeRepository.class);
        return employeeRepository;
    }

    public static ApplicationContext applicationContext() {
        return BasicApplication.applicationContext;
    }
}
