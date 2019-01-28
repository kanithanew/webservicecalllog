package calllog.webservices.calllog_ws.head_editpage;
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
@RequestMapping("/head_editpage")
public class Head_Editpage_Controller {

    @Autowired
    Head_Editpage_Service  head_editpage_Service;

    @GetMapping(params = "payunit")
    public List<Head_Editpage> getHomePage(@RequestParam(value = "payunit") String payunit) {
        return head_editpage_Service.retrieveHomePage(payunit);

    }
}