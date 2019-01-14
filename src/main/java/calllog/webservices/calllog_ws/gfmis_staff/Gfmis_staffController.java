package calllog.webservices.calllog_ws.gfmis_staff;
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
@RequestMapping("/gfmis_staff")
public class Gfmis_staffController {

    @Autowired
    Gfmis_staffService  gfmis_staffService;

    @GetMapping()
    public List<Gfmis_staff> getLogin() {
        return gfmis_staffService.retrieveGfmis_staff();
    }
    @GetMapping(params = "calllogin")
    public List<Gfmis_staff> getLogin(@RequestParam(value = "calllogin") String calllogin) {
        return gfmis_staffService.retrieveGfmis_staff(calllogin);
    }
}