package calllog.webservices.calllog_ws.loginuser_profile;

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
@RequestMapping("/loginuser_profile")
public class Loginuser_ProfileController {
    @Autowired
    Loginuser_ProfileService loginuser_profileService;

    @GetMapping(params = "calllogin")
    public List<Loginuser_Profile> getLoginuser_Profile(@RequestParam(value = "calllogin") String calllogin,
            @RequestParam(value = "callpassword") String callpassword) {
 
        return loginuser_profileService.retrieveLoginuser_Profile(calllogin, callpassword);

    }

}