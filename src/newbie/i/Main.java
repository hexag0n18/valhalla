package newbie.i;

import jdk.jfr.Name;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Base_datos bd = new Base_datos();

        int anio_ingreso;
        String codigo, nombre, carrera;

        while (true) {

            System.out.println("Opciones:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar un estudiante");
            System.out.println("4. Eliminar un estudiante");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Estudiante estu = new Estudiante();
                    System.out.print("Ingrese el codigo: ");
                    sc.nextLine();
                    codigo = sc.nextLine();
                    estu.setCodigo(codigo);

                    System.out.print("Ingrese el nombre: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    estu.setNombre(nombre);

                    System.out.print("Ingrese el año de ingreso: ");
                    anio_ingreso = sc.nextInt();
                    estu.setAnio_ingreso(anio_ingreso);

                    System.out.print("Ingrese el carrera: ");
                    sc.nextLine();
                    carrera = sc.nextLine();
                    estu.setCarrera(carrera);

                    estu.anadirEstudiante(bd);
                    break;
                case 2:
                    Estudiante.mostrarEstudiantes(bd);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    Estudiante.buscarEstudiante(bd, nombre);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    Estudiante.eliminarEstudiante(bd, nombre);
                    break;
                case 5:
                    System.out.println("Good bye...");
                    return;
            }
        }
    }
}
