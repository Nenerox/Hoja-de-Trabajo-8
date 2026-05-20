# Hoja de Trabajo 8
# Sistema de Atención de Pacientes con Priority Queue
Este programa simula el sistema de atención de pacientes en la sección de emergencias de un hospital utilizando una cola con prioridad con dos implementaciones posibles.

Cada paciente posee:

- Nombre
- Síntoma
- Código de prioridad

Las prioridades van desde:

| Prioridad | Descripción |
|---|---|
| A | Atención inmediata |
| B | Alta prioridad |
| C | Prioridad media |
| D | Prioridad baja |
| E | Menor prioridad |

El sistema atiende primero a los pacientes con mayor prioridad.

# Implementaciones realizadas

El proyecto incluye dos implementaciones:

## 1. Implementación propia usando VectorHeap

Clase:

VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>

## 2. Implementación usando Java Collection Framework

Clase utilizada:

java.util.PriorityQueue

# Funcionamiento

1. El programa lee los pacientes desde:

pacientes.txt

2. El usuario selecciona qué implementación utilizar:

1 VectorHeap
2 PriorityQueue

3. Los pacientes son atendidos en orden de prioridad.

# Ejemplo de Entrada

Juan Perez, fractura de pierna, C

Maria Ramirez, apendicitis, A

Lorenzo Toledo, chikunguya, E

Carmen Sarmientos, dolores de parto, B

# Ejemplo de Salida

Maria Ramirez, apendicitis, A

Carmen Sarmientos, dolores de parto, B

Juan Perez, fractura de pierna, C

Lorenzo Toledo, chikunguya, E


# Métodos implementados en VectorHeap

| Método | Descripción |
|---|---|
| insert(E e) | Inserta un elemento |
| remove() | Elimina el mínimo |
| peek() | Retorna el mínimo |
| isEmpty() | Verifica si está vacío |

Métodos auxiliares:

- moverArriba()
- moverAbajo()
- swap()
