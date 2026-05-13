package cat.paucasesnovescifp.cuentas;
import java.time.LocalDate;
public class Cliente {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String localidad;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, String apellidos, LocalDate fechaNacimiento, String direccion, String localidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }



    public String nombreCompleto(){

        return nombre + ", " +  apellidos;
    }

    public String direccionCompleta(){

        return direccion + ", " + localidad;
    }


    

}
