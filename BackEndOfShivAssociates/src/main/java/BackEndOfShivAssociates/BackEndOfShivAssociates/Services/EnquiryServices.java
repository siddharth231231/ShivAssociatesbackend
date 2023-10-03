package BackEndOfShivAssociates.BackEndOfShivAssociates.Services;

import BackEndOfShivAssociates.BackEndOfShivAssociates.Entity.Enquiry;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EnquiryServices {

    public ResponseEntity<Enquiry> getEnquiryDetail(int eid);

    public ResponseEntity<List<Enquiry>> getEnquiryDetails();

    public  ResponseEntity<String>  postEnquiryDetail(Enquiry enquiry);

    public  ResponseEntity<Enquiry> updateEnquiryDetail(Enquiry enquiry);

    public  ResponseEntity<String>  deleteEnquiryDetail(int eid);

}
