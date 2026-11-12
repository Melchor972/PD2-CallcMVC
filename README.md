# PD3-CallcMVC
Calculadora básica de 2 operaciones  

# instrucciones-del-PD3
Con base en las instrucciones de la sesión de hoy 10/Nov utilizar como base el ejemplo de la calculadora MVC.

Enviar el URL donde se encuentra esta actividad que incluya:
Documentación de lo implementado
Código
Diagrama de clases
Video que explique la estrategia para incrementar las operaciones de la calculadora (suma, resta, etc). Mantener el patrón MCV.  Indicar qué ventajas o desventajas específicas hay si se considera el patrón de diseño Command. Si los argumentos indican que no es conveniente, indicar cuál sería la estrategia considerada para incrementar las operaciones de la calculadora, y las ventajas sobre el uso del patrón. Se podría considerar algún otro patrón? Video de máximo 5 minutos. Incluir el URL en el repo (asegurar que hay acceso)
Mi trabajo

# Video-explicativo-del-codigo
Puedes ver la explicación detallada del programa en el siguiente enlace:


Este es el PD3 de la clase de Porgramacion Orientada a Objetos(POO), incluye documentacion codigo requisitos y un diagrama de clases.

# Diagrama-de-clases
<img width="749" height="1055" alt="Untitled" src="https://github.com/user-attachments/assets/afeea0e1-e4ed-4108-a2b2-893bac83b9c7" />

# Requisitos-funcionales-y-no-funcionales 
1. Requisitos Funcionales (RF)
Definen las acciones, entradas, procesamiento y salidas que el sistema debe realizar:

RF-01: Ingreso de datos (Operandos)
El sistema debe proveer un campo de texto en la interfaz gráfica para que el usuario pueda introducir números enteros o fracciones en formato estándar a/b.

RF-02: Operación de Multiplicación
Al hacer clic en el botón de multiplicar ("Multiply"), el sistema debe tomar el valor ingresado, multiplicarlo por el acumulador actual del modelo, simplificar el resultado y actualizar la vista del total.

RF-03: Operación de Suma
Al hacer clic en el botón de suma ("Add"), el sistema debe sumar la fracción o número ingresado al acumulador actual utilizando la regla algebraica de suma de fracciones, simplificar el resultado y mostrarlo en la interfaz.

RF-04: Simplificación Automática
El sistema debe calcular automáticamente el Máximo Común Divisor (MCD) del numerador y denominador tras cada operación aritmética para presentar la fracción irreducible resultante, asegurando que el signo negativo se mantenga siempre en el numerador.

RF-05: Restablecer / Limpiar (Clear)
Al hacer clic en el botón de limpiar ("Clear"), el sistema debe restablecer los valores internos del modelo a cero y vaciar los campos de texto de la interfaz gráfica.

RF-06: Validación de Formato de Entrada
El sistema debe capturar excepciones de tipo NumberFormatException si el usuario introduce caracteres no válidos e interrumpir la operación mostrando un mensaje de error descriptivo en pantalla.

RF-07: Validación de División por Cero
El sistema debe detectar e impedir operaciones aritméticas inválidas (como introducir un denominador igual a cero), lanzando y mostrando un mensaje de error por excepción aritmética (ArithmeticException).

2. Requisitos No Funcionales (RNF)
Definen las restricciones de diseño, calidad, arquitectura y tecnología del sistema:

RNF-01: Patrón Arquitectónico (MVC)
El software debe implementar estrictamente el patrón de diseño Modelo-Vista-Controlador (MVC), separando físicamente el código en paquetes independientes (model, view, controller) para garantizar un bajo acoplamiento y alta cohesión.

RNF-02: Interfaz Gráfica de Usuario (GUI)
La interfaz visual debe desarrollarse utilizando la biblioteca nativa Java Swing (JFrame, JButton, JTextField), empleando un contenedor con diseño fluido (FlowLayout) para una interacción rápida y ligera.

RNF-03: Acceso Libre y Dominio Público
Debido a que la aplicación está diseñada para uso de dominio público, el sistema no debe incluir módulos de autenticación, inicio de sesión (iniciar sesión) ni gestión de usuarios o permisos.

RNF-04: Portabilidad y Compatibilidad
Al estar programado íntegramente en lenguaje Java, el sistema debe ser multiplataforma, pudiendo ejecutarse en cualquier sistema operativo que disponga de una Máquina Virtual de Java (JVM).

RNF-05: Rendimiento y Respuesta
Las operaciones de cálculo fraccionario y actualización de la interfaz gráfica deben resolverse de manera instantánea (en un tiempo menor a 0.1 segundos) tras la interacción del usuario con los botones de acción.
