import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
    Map<String,alumno> listaAlumnos = new TreeMap();

    int op=1;
    Iterator iterator= listaAlumnos.keySet().iterator();
    Scanner in = new Scanner(System.in);
    while(op!=0){
        System.out.println("Elija una opcion :\n1.Agregar Alumno\n2.Eliminar Alumno\n3.Tomar Asistencia\n4.Ver Asistencias\nOP :  ");
        op= in.nextInt();
        if(op==1){
            String name,lastName;
            System.out.println("Apellido:");
            lastName= in.next();
            System.out.println("Nombre:");
            name= in.next();
            alumno neww=new alumno(name,lastName,0,0);
            listaAlumnos.put(lastName,neww);
        }
        if(op==2){
        System.out.println("Fuera de servicio xd");
        }
        if(op==3){
            System.out.println("Asitencia 1 Falta 0");
            iterator= listaAlumnos.keySet().iterator();
        while (iterator.hasNext()){

            String key = (String) iterator.next();
            System.out.println(key +" "+listaAlumnos.get(key).getName());
            op=in.nextInt();
            if(op==1){
                int aux=listaAlumnos.get(key).getAsistencia();
                aux++;
                listaAlumnos.get(key).setAsistencia(aux);
            }else {
                int aux=listaAlumnos.get(key).getFaltas();
                aux++;
                listaAlumnos.get(key).setFaltas(aux);
            }
        }
        op=3;
        }
        if(op==4){
            System.out.println("Apellido   Nombre  Asistencia  Faltas");
            iterator= listaAlumnos.keySet().iterator();
            while(iterator.hasNext()){
                String key = (String) iterator.next();
                System.out.println(key+ "      "+ listaAlumnos.get(key).getName()+"       "+ listaAlumnos.get(key).getAsistencia()+"        "+listaAlumnos.get(key).getFaltas() );
            }
        }
        }
    }
}