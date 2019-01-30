package calllog.webservices.calllog_ws.detail_editpage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detail_editpage")
public class Detail_Editpage_Controller {

    @Autowired
    Detail_Editpage_Service  detail_editpage_Service;

  /*  @GetMapping(params = "payunit")
    public List<Head_Editpage> getHomePage(@RequestParam(value = "payunit") String payunit) {
        return head_editpage_Service.retrieveHomePage(payunit);

    }
    @PostMapping()
    public ResponseEntity<?> postCustomer(@Valid @RequestBody Customer body) {
        Customer customer = customerService.createCustomer(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }

    */
    @PostMapping()
    public ResponseEntity<?> postDetailEditpage(@Valid @RequestBody Detail_Editpage body) {
        Detail_Editpage detail = detail_editpage_Service.createDetailEditpage(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(detail);
    }

}