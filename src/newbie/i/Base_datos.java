package newbie.i;

import java.util.ArrayList;

public class Base_datos {
    ArrayList<String> codigo = new ArrayList<String>();
    ArrayList<String> nombre = new ArrayList<String>();
    ArrayList<Integer> anio_ingreso = new ArrayList<Integer>();
    ArrayList<String> carrera = new ArrayList<String>();

    public void anadirGrupo(String codigo, String nombre, int anio_ingreso, String carrera){
        this.codigo.add(codigo);
        this.nombre.add(nombre);
        this.anio_ingreso.add(anio_ingreso);
        this.carrera.add(carrera);
    }

    public void mostrar(){
        if (this.codigo.size() > 0){
            for (int i = 0; i < this.codigo.size(); i++){
                System.out.print(this.codigo.get(i));
                System.out.print(" --> ");
                System.out.print(this.nombre.get(i));
                System.out.print(" --> ");
                System.out.print(this.anio_ingreso.get(i));
                System.out.print(" --> ");
                System.out.println(this.carrera.get(i));
            }
        }else{
            System.out.println("No hay entradas");
        }

    }

    public void mostrar_uno(String nombre){
        if(this.nombre.contains(nombre)) {
            int i = this.nombre.indexOf(nombre);
            System.out.print(this.codigo.get(i));
            System.out.print(" --> ");
            System.out.print(this.nombre.get(i));
            System.out.print(" --> ");
            System.out.print(this.anio_ingreso.get(i));
            System.out.print(" --> ");
            System.out.println(this.carrera.get(i));
        }else{
            System.out.println("No existe el estudiante");
        }
    }

    public void eliminar_uno(String nombre){
        if(this.nombre.contains(nombre)) {
            int i = this.nombre.indexOf(nombre);
            this.codigo.remove(i);
            this.nombre.remove(i);
            this.anio_ingreso.remove(i);
            this.carrera.remove(i);
            System.out.println("Eliminado correctamente");
        }else{
            System.out.println("No existe el estudiante");
        }
    }
}
