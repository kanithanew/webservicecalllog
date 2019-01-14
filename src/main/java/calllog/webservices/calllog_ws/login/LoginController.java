package calllog.webservices.calllog_ws.login;
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
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping()
    public List<Login> getLogin() {
        return loginService.retrieveLogin();
    }
    @GetMapping(params = "name")
    public List<Login> getLogin(@RequestParam(value = "name") String name) {
        return loginService.retrieveLogin(name);
    }
}