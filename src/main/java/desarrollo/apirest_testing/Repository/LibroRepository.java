package desarrollo.apirest_testing.Repository;

import desarrollo.apirest_testing.Entity.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long>{
}
