package desarrollo.apirest_testing.Controller;

import desarrollo.apirest_testing.Entity.Domicilio;
import desarrollo.apirest_testing.Service.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "parcial/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}
