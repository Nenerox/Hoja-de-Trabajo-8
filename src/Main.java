import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TxtReader reader = new TxtReader();

        // Crear un min-heap utilizando la clase VectorHeap
        VectorHeap<Paciente> minheap = new VectorHeap<>();

        // Crear una PriorityQueue usando el JCF de Java
        PriorityQueue<Paciente> priorityQueue = new PriorityQueue<>();

        //agregar pacientes al VectorHeap y a la PriorityQueue
        String[] pacientes = reader.readFile("src\\pacientes.txt", "\n");
        for (String paciente : pacientes) {
            String[] info = paciente.split(",");
            String nombre = info[0];
            String sintoma = info[1];
            String prioridad = info[2];
            Paciente p = new Paciente(nombre, sintoma, prioridad);
            minheap.insert(p);
            priorityQueue.add(p);
        }

        int opcion = 0;
        System.out.println("Seleccione la implementacion de datos para gestionar los pacientes:");
        System.out.println("1. VectorHeap \n2. PriorityQueue");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch(opcion) {
            case 1:
                while (!minheap.isEmpty()) {
                    System.out.println("Paciente actual: " + minheap.remove());
                    System.out.println("Presione enter para el siguiente paciente");
                    scanner.nextLine();
                }
                System.out.println("No hay más pacientes en espera.");
                break;
            case 2:
                while (!priorityQueue.isEmpty()) {
                    System.out.println("Paciente actual: " + priorityQueue.poll());
                    System.out.println("Presione enter para el siguiente paciente");
                    scanner.nextLine();
                }
                System.out.println("No hay más pacientes en espera.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
