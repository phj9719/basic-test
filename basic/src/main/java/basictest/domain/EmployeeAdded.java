package basictest.domain;

import basictest.domain.*;
import basictest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class EmployeeAdded extends AbstractEvent {

    private Long id;
    private String userId;
    private Boolean isManager;
    private Boolean departmentId;
    private Boolean rankId;

    public EmployeeAdded(Employee aggregate) {
        super(aggregate);
    }

    public EmployeeAdded() {
        super();
    }
}
