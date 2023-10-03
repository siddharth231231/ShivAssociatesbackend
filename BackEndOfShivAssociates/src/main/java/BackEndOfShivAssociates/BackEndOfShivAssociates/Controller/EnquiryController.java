package BackEndOfShivAssociates.BackEndOfShivAssociates.Controller;

import BackEndOfShivAssociates.BackEndOfShivAssociates.Entity.Enquiry;
import BackEndOfShivAssociates.BackEndOfShivAssociates.Services.EnquiryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
public class EnquiryController {

    @Autowired
    public  EnquiryServiceImpl enquiryService;

    @GetMapping("/getDetail/{eid}")
    public ResponseEntity<Enquiry> getEnquiryDetail(@PathVariable int eid){
        ResponseEntity<Enquiry> enquiryDetail = enquiryService.getEnquiryDetail(eid);
        return enquiryDetail;
    }

    @GetMapping("/getDetails")
    public ResponseEntity<List<Enquiry>> getEnquiryDetails(){
        ResponseEntity<List<Enquiry>> enquiryDetails = this.enquiryService.getEnquiryDetails();
        return enquiryDetails;
    }


//
    @PostMapping("/postDetails")
    public  ResponseEntity<String> postEnquiryDetail(@RequestBody Enquiry enquiry){
        ResponseEntity<String> stringResponseEntity = enquiryService.postEnquiryDetail(enquiry);
        return stringResponseEntity;
    }

    @PutMapping ("/updateDetails")
    public  ResponseEntity<Enquiry> updateEnquiryDetail(@RequestBody Enquiry enquiry){
        ResponseEntity<Enquiry> enquiryResponseEntity = enquiryService.updateEnquiryDetail(enquiry);
        return enquiryResponseEntity;
    }

    @DeleteMapping("/deleteEnquiry/{eid}")
    public  ResponseEntity<String> deleteEnquiryDetail(@PathVariable int eid){
        ResponseEntity<String> stringResponseEntity = enquiryService.deleteEnquiryDetail(eid);
        return stringResponseEntity;
    }

}
