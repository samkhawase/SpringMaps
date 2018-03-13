package locations;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "location", path = "location")
public interface LocationRepository extends PagingAndSortingRepository<Location, Long> {
    List<Location> findByLocationName(@Param("name") String name);

}
