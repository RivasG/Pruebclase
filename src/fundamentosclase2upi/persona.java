
package fundamentosclase2upi;

import javax.swing.JOptionPane;

public class persona {//esta es la clase
  //atributos de la persona
    String nombre;
    String apellido;
    int cedula;
    int edad;
    char genero; // El dato tipo char almacena un caracter
    double nota;
    public static void main(String[] args) { //crear un main para ejecutar la clase
    persona estudiante=new persona (); // crear objeto estduiante de la clase persona
    //entrada de datos con JOPtionPane
    estudiante.nombre=JOptionPane.showInputDialog("Digite el nombre del estudiante");
    estudiante.apellido=JOptionPane.showInputDialog("Digite el apellido del estudiante");
    estudiante.cedula=Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del estudiante"));
    estudiante.edad=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del estudiante"));
    estudiante.nota=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del estudiante"));
    estudiante.genero=JOptionPane.showInputDialog("Digite el genero del estudiante M o F").charAt(0);
    
    //salida con interfaz gráfica
    JOptionPane.showMessageDialog(null,"Datos del estudiante :"
            + "\n El nombre del alumno(a) es : "+estudiante.nombre
            + "\n El apellido del alumno(a) es :"+estudiante.apellido
            + "\n La cedula del alumno(a) es :"+estudiante.cedula
            + "\n El La nota del alumno(a) es :"+estudiante.nota
            + "\n El genero del alumno(a) es :"+estudiante.genero);
    
    
    } //este corchete cierra el main
  
} //este corchete cierra la clase
