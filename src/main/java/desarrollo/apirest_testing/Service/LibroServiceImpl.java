package desarrollo.apirest_testing.Service;

import desarrollo.apirest_testing.Repository.BaseRepository;
import desarrollo.apirest_testing.Repository.LibroRepository;
import desarrollo.apirest_testing.Entity.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
