package fi.vm.sade.cas.oppija;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/secured/principal")
public class PrincipalController {

    @GetMapping
    public Principal getPrincipal(Principal principal) {
        return principal;
    }

}
