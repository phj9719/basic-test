package basictest.domain;

import java.util.List;

import basictest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="employees", path="employees")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
  List<Employee> (String userId);
}
