
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import com.example.demo.*;
@Entity
@Table(name = "Paciente")
public class paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rut;

    private String nombre;
    private String nacionalidad;
    private String sexo;
    private String fecha_na;
    private String domicilio;
    private String diagnostico;
    private String telefono;
    private String gravedad;
    public paciente(){
};
    public paciente(String nombre, String nacionalidad, Long rut, String sexo, String fecha_na, String domicilio, String diagnostico,
     String telefono,
    String gravedad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.rut = rut;
        this.sexo = sexo;
        this.fecha_na = fecha_na;
        this.domicilio = domicilio;
        this.diagnostico = diagnostico;
        this.telefono = telefono;
        this.gravedad = gravedad;
    };
    public Long getRut() {
        return this.rut;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getfecha_na(){
        return this.fecha_na;
    }
    public String getSexo(){
        return this.sexo;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getDiagnostico(){
        return this.diagnostico;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getGravedad(){
        return this.gravedad;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
};