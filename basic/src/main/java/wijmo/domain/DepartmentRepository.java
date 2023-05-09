package wijmo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wijmo.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "departments",
    path = "departments"
)
public interface DepartmentRepository
    extends PagingAndSortingRepository<Department, Long> {}
