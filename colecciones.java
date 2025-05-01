import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionEstudiantes {

    public static void main(String[] args) {
        // Lista de estudiantes
        List<String> estudiantes = new ArrayList<>();
        estudiantes.add("María");
        estudiantes.add("Carlos");
        estudiantes.add("Ana");
        estudiantes.add("Luis");

        System.out.println("Estudiantes originales: " + estudiantes);

        // Ordenar alfabéticamente
        Collections.sort(estudiantes);
        System.out.println("Estudiantes ordenados: " + estudiantes);

        // Mapa de calificaciones
        Map<String, Integer> calificaciones = new HashMap<>();
        calificaciones.put("María", 95);
        calificaciones.put("Carlos", 88);
        calificaciones.put("Ana", 92);
        calificaciones.put("Luis", 85);

        // Mostrar calificaciones
        System.out.println("\nCalificaciones:");
        for (Map.Entry<String, Integer> entry : calificaciones.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Buscar estudiante
        String buscar = "Ana";
        if (estudiantes.contains(buscar)) {
            System.out.println("\n" + buscar + " está en la lista con calificación: " + 
                              calificaciones.get(buscar));
        }
    }
}