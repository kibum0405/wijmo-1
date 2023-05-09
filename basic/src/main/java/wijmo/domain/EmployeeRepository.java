package wijmo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wijmo.domain.*;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository
    extends PagingAndSortingRepository<Employee, Long> {}
