package newbie.i;

public class Estudiante {

    private String codigo;
    private String nombre;
    private int anio_ingreso;
    private String carrera;

    public Estudiante(){
        setCodigo(codigo);
        setNombre(nombre);
        setAnio_ingreso(anio_ingreso);
        setCarrera(carrera);
    }

    private String getCodigo(){
        return this.codigo;
    }

    private String getNombre(){
        return this.nombre;
    }

    private int getAnio_ingreso(){
        return this.anio_ingreso;
    }

    private String getCarrera(){
        return this.carrera;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAnio_ingreso(int anio_ingreso){
        this.anio_ingreso = anio_ingreso;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void anadirEstudiante(Base_datos bd){
        bd.anadirGrupo(this.getCodigo(),this.getNombre(),this.getAnio_ingreso(),this.getCarrera());
    }

    public static void mostrarEstudiantes(Base_datos bd){
        bd.mostrar();
    }

    public static void buscarEstudiante(Base_datos bd, String nombre){
        bd.mostrar_uno(nombre);
    }

    public static void eliminarEstudiante(Base_datos bd, String nombre){
        bd.eliminar_uno(nombre);
    }
}
