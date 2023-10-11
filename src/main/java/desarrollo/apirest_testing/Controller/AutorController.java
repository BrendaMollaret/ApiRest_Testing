package desarrollo.apirest_testing.Controller;

import desarrollo.apirest_testing.Entity.Autor;
import desarrollo.apirest_testing.Service.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "parcial/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
