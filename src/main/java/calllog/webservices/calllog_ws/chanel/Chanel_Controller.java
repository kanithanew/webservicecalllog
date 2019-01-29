package calllog.webservices.calllog_ws.chanel;
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
@RequestMapping("/chanel")
public class Chanel_Controller {

    @Autowired
    Chanel_Service  chanel_Service;

    @GetMapping()
    public List<Chanel> getChanel() {
        return chanel_Service.retrieveChanel();

    }
}