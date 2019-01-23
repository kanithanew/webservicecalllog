package calllog.webservices.calllog_ws.homepage;
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
@RequestMapping("/homepage")
public class HomePage_Controller {

    @Autowired
    HomePage_Service  homepage_Service;

    @GetMapping(params = "calllogin")
    public List<HomePage> getHomePage(@RequestParam(value = "calllogin") String calllogin) {
        return homepage_Service.retrieveHomePage(calllogin);

    }
}