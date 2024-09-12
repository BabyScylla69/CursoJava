package ListEjercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Alumno> listAlumnos = new ArrayList<>();
        listAlumnos.add(new Alumno("Temp", 2));
        boolean fin = false;
        int option, inputAge;
        String inputName, inputNewName;
        Alumno alum;
        while (!fin)
        {
            System.out.println("Select an option");
            System.out.println("1-Alta\n2-Baja\n3-Modificar datos\n4-Consultar lista alumnos");
            option = Integer.parseInt(br.readLine());
            Iterator <Alumno> it = listAlumnos.iterator();

            switch (option){
                case 1:
                    System.out.println("Introduzca el nombre del nuevo alumno");
                    inputName = br.readLine();
                    System.out.println("Introduzca la edad del alumno");
                    inputAge = Integer.parseInt(br.readLine());
                    Alumno temp = new Alumno(inputName, inputAge);
                    listAlumnos.add(temp);
                    break;
                case 2:
                    System.out.println("Introduzca el nombre del alumno");
                    inputName = br.readLine();
                    if (listAlumnos.isEmpty())
                        System.out.println("No hay alumnos");
                    else
                        while(it.hasNext())
                        {
                            alum = it.next();
                            System.out.println(alum.getNombre());

                            if (alum.getNombre().equals(inputName))
                            {
                                it.remove();
                            }
                        }
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del alumno");
                    inputName = br.readLine();
                    System.out.println("Introduzca su nuevo nombre");
                    inputNewName = br.readLine();
                    System.out.println("Introduzca su nueva edad");
                    inputAge = Integer.parseInt(br.readLine());
                    if (listAlumnos.isEmpty())
                        System.out.println("No hay alumnos");
                    else
                        for (Alumno alumn : listAlumnos)
                            if (alumn.getNombre().equals(inputName)) {
                                alumn.setNombre(inputNewName);
                                alumn.setEdad(inputAge);
                            }
                    break;
                case 4:
                    if (listAlumnos.isEmpty())
                        System.out.println("No hay alumnos");
                    else
                        for (Alumno alumn : listAlumnos)
                        {
                            System.out.println(alumn.getNombre()+", "+ alumn.getEdad()+" años");
                            System.out.println();
                        }
                    break;
                case 5:
                    fin = true;
                    break;
            }
        }
    }
}
