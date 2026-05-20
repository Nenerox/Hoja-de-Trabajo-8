import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TxtReader reader = new TxtReader();
        VectorHeap<Paciente> minheap = new VectorHeap<>();

        String[] pacientes = reader.readFile("src\\pacientes.txt", "\n");

        for (String paciente : pacientes) {
            String[] info = paciente.split(",");
            String nombre = info[0];
            String sintoma = info[1];
            String prioridad = info[2];
            Paciente p = new Paciente(nombre, sintoma, prioridad);
            minheap.insert(p);
        }
        
        while (!minheap.isEmpty()) {
            System.out.println("Paciente actual: " + minheap.remove());
            System.out.println("Presione enter para el siguiente paciente");
            scanner.nextLine();
        }
        System.out.println("No hay más pacientes en espera.");
    }
}
