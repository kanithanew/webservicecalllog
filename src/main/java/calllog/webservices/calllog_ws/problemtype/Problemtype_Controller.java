package calllog.webservices.calllog_ws.problemtype;
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
@RequestMapping("/problemtype")
public class Problemtype_Controller {

    @Autowired
    Problemtype_Service  problemtype_Service;

    @GetMapping()
    public List<Problemtype> getProblemtype() {
        return problemtype_Service.retrieveProblemtype();

    }
}