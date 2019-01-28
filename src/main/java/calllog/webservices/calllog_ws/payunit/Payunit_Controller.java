package calllog.webservices.calllog_ws.payunit;
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
@RequestMapping("/payunit")
public class Payunit_Controller {

    @Autowired
    Payunit_Service  payunit_Service;

    @GetMapping(params = "payunit")
    public List<Payunit> getHomePage(@RequestParam(value = "payunit") String payunit) {
        return payunit_Service.retrievePayunit(payunit);

    }
}