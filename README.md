# 4-Prueba-PatronesDeComportamiento
UML : 
## Este Package contiene dos clases: 

# Clase Controlador:
Actúa como un intermediario entre el modelo (`Modelo`) y la vista (`Vista`). Gestiona la lógica de negocio y coordina las interacciones entre el modelo y la vista.

### Clases y Funcionalidades

  - Controlador: Clase principal que controla la lógica de la aplicación.
  - `modelo`: Instancia de la clase `Modelo` que almacena los datos de la aplicación.
  - `vista`: Instancia de la clase `Vista` que proporciona la interfaz de usuario.
  - `cuentaInfinita`: Instancia de la clase `CuentaInfinita` que ejecuta un proceso infinito.
  - `cuentaAtras`: Instancia de la clase `CuentaAtras` que ejecuta un conteo regresivo.
  - `Controlador(Vista vista)`: Constructor que inicializa el controlador con una instancia de vista y los procesos de cuenta infinita y cuenta atrás.
  - `incrementCount()`: Método para incrementar el contador del modelo y actualizar la vista.
  - `startCuentaInfinita()`: Método para iniciar el proceso de cuenta infinita.
  - `startCuentaAtras()`: Método para iniciar el proceso de cuenta atrás.
  - `stopCuentaAtras()`: Método para detener el proceso de cuenta atrás.

### Dependencias

- **Modelo**: Representa los datos y la lógica de la aplicación.
- **Vista**: Proporciona la interfaz de usuario para la aplicación.
- **Proceso**: Interfaz que define el comportamiento de un proceso.
- **CuentaInfinita**: Implementación de `Proceso` que ejecuta un bucle infinito.
- **CuentaAtras**: Implementación de `Proceso` que ejecuta un conteo regresivo.

### Uso

1. Crea una instancia de `Controlador`, pasando una instancia de `Vista` como parámetro.
2. Utiliza los métodos proporcionados por `Controlador` para interactuar con el modelo y la vista, iniciar y detener los procesos de cuenta infinita y cuenta atrás.
   
# Clase Reverser: 

Esta clase implementa la interfaz `Proceso` y actúa como un proceso que ejecuta un bucle infinito basado en la evaluación de un código de programa.

### Funcionalidades

  - Reverser: Clase que implementa la interfaz `Proceso` y ejecuta un proceso basado en la lógica de reversión.
  - `haltChecker`: Instancia de `HaltChecker` utilizada para verificar si el programa entrará en un bucle infinito.
  - `vista`: Instancia de `Vista` utilizada para actualizar la interfaz de usuario con mensajes.
  - `Reverser()`: Constructor que inicializa la instancia de `Reverser`.
  - `run(String programCode, String programInput)`: Método que ejecuta el proceso de reversión. Verifica la entrada del programa y determina si entra en un bucle infinito.
  - `execute()`: Método de la interfaz `Proceso` que ejecuta el proceso de reversión con datos de ejemplo.
  - `stop()`: Método de la interfaz `Proceso` que detiene el proceso de reversión.

### Dependencias

- **Proceso**: Interfaz que define el comportamiento de un proceso.
- **InputInvalido**: Excepción que se lanza cuando la entrada del programa es inválida.
- **HaltChecker**: Clase utilizada para verificar si un programa entrará en un bucle infinito.
- **Vista**: Clase utilizada para actualizar la interfaz de usuario con mensajes.

### Uso

1. Crea una instancia de `Reverser`.
2. Utiliza el método `execute()` para ejecutar el proceso de reversión con datos de ejemplo.
3. Observa la salida en la vista para determinar si el programa entra en un bucle infinito o no.

## Package Excepciones 

# InputInvalido

Esta clase define una excepción personalizada llamada `InputInvalido`, que se utiliza para indicar que la entrada proporcionada al programa es inválida.

### Funcionalidades

  - InputInvalido: Clase que extiende `Throwable` y representa una excepción que se lanza cuando la entrada del programa es inválida.
  - `InputInvalido(String message)`: Constructor que permite especificar un mensaje de error para la excepción.

### Uso

1. Crea una instancia de `InputInvalido`, proporcionando un mensaje de error descriptivo.
2. Lanza la excepción en tu código cuando encuentres una entrada inválida para el programa.
   
## Package Modelo

# CuentaAtras

Esta clase implementa la interfaz `Proceso` y representa un proceso que realiza una cuenta regresiva y actualiza la vista con cada cuenta atrás.

### Funcionalidades

  - CuentaAtras: Clase que implementa la interfaz `Proceso` y realiza una cuenta regresiva.
  - `vista`: Instancia de `Vista` utilizada para mostrar el conteo regresivo en la interfaz de usuario.
  - `CuentaAtras(Vista vista)`: Constructor que inicializa la instancia de `CuentaAtras` con una instancia de `Vista`.
  - `execute()`: Método de la interfaz `Proceso` que ejecuta la cuenta regresiva y actualiza la vista con cada cuenta atrás.
  - `stop()`: Método de la interfaz `Proceso` que detiene el proceso de cuenta atrás (no implementado en esta clase).

### Dependencias

- **Vista**: Clase utilizada para actualizar la interfaz de usuario con mensajes.

### Uso

1. Crea una instancia de `CuentaAtras`, pasando una instancia de `Vista` como parámetro.
2. Ejecuta el proceso llamando al método `execute()`.
3. Observa cómo se actualiza la vista con cada cuenta atrás.

# CuentaInfinita

Esta clase implementa la interfaz `Proceso` y representa un proceso que realiza un conteo infinito y actualiza la vista con cada incremento.

### Funcionalidades

  - CuentaInfinita: Clase que implementa la interfaz `Proceso` y realiza un conteo infinito.
  - `vista`: Instancia de `Vista` utilizada para actualizar la interfaz de usuario con el conteo infinito.
  - `CuentaInfinita(Vista vista)`: Constructor que inicializa la instancia de `CuentaInfinita` con una instancia de `Vista`.
  - `execute()`: Método de la interfaz `Proceso` que ejecuta el conteo infinito y actualiza la vista con cada incremento.
  - `stop()`: Método de la interfaz `Proceso` que detiene el proceso de conteo infinito (no implementado en esta clase).

### Dependencias

- **Vista**: Clase utilizada para actualizar la interfaz de usuario con mensajes.

### Uso

1. Crea una instancia de `CuentaInfinita`, pasando una instancia de `Vista` como parámetro.
2. Ejecuta el proceso llamando al método `execute()`.
3. Observa cómo se actualiza la vista con cada incremento en el conteo infinito.

# Modelo

Esta clase representa el modelo de datos de la aplicación.

### Funcionalidades

  - Modelo: Clase que representa el modelo de datos de la aplicación.
  - `count`: Variable entera que almacena un valor numérico.
  - `getCount()`: Método para obtener el valor actual de `count`.
  - `setCount(int count)`: Método para establecer el valor de `count`.

### Uso

1. Crea una instancia de `Modelo`.
2. Utiliza los métodos `getCount()` y `setCount(int count)` para acceder y modificar el valor de `count`, respectivamente.


# Proceso

Esta interfaz define el comportamiento que deben seguir los procesos en la aplicación.

### Funcionalidades

  - Proceso: Interfaz que define el comportamiento de un proceso en la aplicación.
  - `execute()`: Método que debe ser implementado por las clases que implementen esta interfaz. Se encarga de ejecutar el proceso.
  - `stop()`: Método que debe ser implementado por las clases que implementen esta interfaz. Se encarga de detener el proceso.

### Uso

1. Implementa la interfaz `Proceso` en las clases que representen los diferentes procesos de la aplicación.
2. Implementa el método `execute()` para definir la lógica del proceso.
3. Implementa el método `stop()` para definir la acción de detener el proceso si es necesario.

## Package Verificadores

# HaltChecker

Esta clase proporciona funcionalidades para verificar si un proceso se detendrá o no, basado en ciertas condiciones.

### Funcionalidades

  - HaltChecker: Clase que proporciona métodos para verificar si un proceso se detendrá o no.
  - `getInstance()`: Método estático que devuelve una instancia única de `HaltChecker`.
  - `willHalt(Proceso proceso, Proceso input) throws InputInvalido`: Método que verifica si un proceso se detendrá o no, basado en el tipo de procesos proporcionados como entrada.
  - `willHalt(String programCode)`: Método sobrecargado que no está implementado actualmente.

### Uso

1. Obtén una instancia de `HaltChecker` utilizando el método `getInstance()`.
2. Utiliza el método `willHalt(Proceso proceso, Proceso input)` para verificar si un proceso se detendrá o no, proporcionando los procesos relevantes como entrada.
3. Maneja cualquier excepción `InputInvalido` que pueda ser lanzada por el método `willHalt()`.

## Package Vista

# Vista

Esta clase representa la interfaz de usuario de la aplicación.

### Funcionalidades

  - Vista: Clase que define la interfaz de usuario de la aplicación.
  - `frame`: Instancia de `JFrame` que representa la ventana principal de la interfaz de usuario.
  - `label`: Instancia de `JLabel` que muestra información en la interfaz de usuario.
  - `btnCuentaInfinita`: Instancia de `JButton` para iniciar el proceso de cuenta infinita.
  - `btnCuentaAtras`: Instancia de `JButton` para iniciar el proceso de cuenta atrás.
  - `controlador`: Instancia de `Controlador` que maneja las acciones del usuario en la interfaz.

### Métodos

- `Vista(Controlador controlador)`: Constructor que inicializa la interfaz de usuario con un controlador.
- `mostrar(int count)`: Método para mostrar un número en la etiqueta de la interfaz.
- `update(String mensaje)`: Método para actualizar la etiqueta de la interfaz con un mensaje.
- `actualizarTexto(String mensaje)`: Método para actualizar la etiqueta de la interfaz con un mensaje y un salto de línea.

### Uso

1. Crea una instancia de `Vista`, pasando una instancia de `Controlador` como parámetro.
2. Utiliza los métodos proporcionados por `Vista` para actualizar la interfaz de usuario según sea necesario.
3. Controla las acciones del usuario, como iniciar los procesos de cuenta infinita y cuenta atrás, mediante los botones proporcionados en la interfaz.

# Main

Este archivo contiene la clase principal `Main` que sirve como punto de entrada para la aplicación.

### Funcionalidades

  - Main: Clase principal que inicia la aplicación y muestra ejemplos de uso de las diferentes clases y componentes.
  - `main(String[] args)`: Método principal de la aplicación.
    - Crea una instancia de `Controlador`.
    - Crea una instancia de `Vista`.
    - Crea instancias de los procesos `CuentaAtras` y `CuentaInfinita`.
    - Crea una instancia de `HaltChecker`.
    - Utiliza `HaltChecker` para verificar si los procesos se detendrán.
    - Utiliza `Reverser` para ejecutar un programa.
    - Entra en un bucle infinito.

### Uso

1. Ejecuta la clase `Main`.
2. Observa la salida en la consola, que mostrará ejemplos de verificación de procesos, ejecución de programas y entrada en bucles infinitos.
