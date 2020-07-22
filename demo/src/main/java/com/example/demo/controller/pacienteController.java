

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
@RequestMapping("/api/pacientes")
public class pacienteController {
    @Autowired
    private pacienteService pacienteService;
    @PostMapping("")
    public ResponseEntity<paciente> addPaciente (@RequestBody paciente paciente){
        paciente pac = pacienteService.saveOrUpdatePaciente(paciente);
        return new ResponseEntity<paciente>(pac,HttpStatus.CREATED);
    }
    @GetMapping("")
    public Iterable<paciente> getPacientes(){
        return pacienteService.listAll();
    }
}