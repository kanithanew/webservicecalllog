package calllog.webservices.calllog_ws.module;
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
@RequestMapping("/module")
public class Module_Controller {

    @Autowired
    Module_Service  module_Service;

    @GetMapping()
    public List<Module> getHomePage() {
        return module_Service.retrieveModule();

    }
}