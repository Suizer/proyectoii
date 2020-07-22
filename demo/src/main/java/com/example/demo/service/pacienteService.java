
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class pacienteService{
    @Autowired
    private pacienteRepository pacienteRepository;
    public paciente saveOrUpdatePaciente(paciente paciente){
        return pacienteRepository.save(paciente);
    }
    public Iterable<paciente> listAll(){
        return pacienteRepository.findAll();
    }
}