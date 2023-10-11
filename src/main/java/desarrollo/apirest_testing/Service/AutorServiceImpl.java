package desarrollo.apirest_testing.Service;

import desarrollo.apirest_testing.Repository.AutorRepository;
import desarrollo.apirest_testing.Repository.BaseRepository;
import desarrollo.apirest_testing.Entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
