package calllog.webservices.calllog_ws.force;
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
@RequestMapping("/force")
public class Force_Controller {

    @Autowired
    Force_Service  force_Service;

    @GetMapping()
    public List<Force> getForce() {
        return force_Service.retrieveForce();

    }
}