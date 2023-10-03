package BackEndOfShivAssociates.BackEndOfShivAssociates.Repository;

import BackEndOfShivAssociates.BackEndOfShivAssociates.Entity.Enquiry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Enquiryrepository extends CrudRepository<Enquiry, Integer> {
    
}
