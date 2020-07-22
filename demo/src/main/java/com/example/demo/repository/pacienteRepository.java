import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.*;
@Repository
public interface pacienteRepository extends CrudRepository <paciente,Long> {
    
    
}