package BackEndOfShivAssociates.BackEndOfShivAssociates.Services;

import BackEndOfShivAssociates.BackEndOfShivAssociates.Entity.Enquiry;
import BackEndOfShivAssociates.BackEndOfShivAssociates.Repository.Enquiryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EnquiryServiceImpl implements EnquiryServices{

    @Autowired
   public Enquiryrepository repo;

    @Override
    public ResponseEntity<Enquiry> getEnquiryDetail(int eid) {
        try {
            Enquiry enquiryDetail = repo.findById(eid).get();
            return new ResponseEntity<>(enquiryDetail, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<List<Enquiry>> getEnquiryDetails() {
        List<Enquiry> all = (List<Enquiry>) this.repo.findAll();
        return new ResponseEntity<>(all,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> postEnquiryDetail(Enquiry enquiry) {
        repo.save(enquiry);
        return new ResponseEntity<>("Created",HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Enquiry> updateEnquiryDetail(Enquiry enquiry) {
        repo.save(enquiry);
        return new ResponseEntity<>(enquiry,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteEnquiryDetail(int eid) {
        repo.deleteById(eid);
        return new ResponseEntity<>("deleted",HttpStatus.OK);
    }
}
