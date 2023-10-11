package desarrollo.apirest_testing.Controller;

import desarrollo.apirest_testing.Entity.Libro;
import desarrollo.apirest_testing.Service.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "parcial/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}