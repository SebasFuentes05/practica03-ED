import java.util.*;

public class Persona {
    String nombre, dni, sexo;
    int edad;
    double peso, altura;

    //Constructores
    
    public Persona(){
        this.nombre = "Sebastian";
        this.edad = 18;
        this.dni = "20111111-U";
        this.sexo = "H";
        this.peso = 75;
        this.altura = 1.80;
    }

    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Método esMayorDeEdad
    
    public boolean esMayorDeEdad(){
        return (this.edad>=18)?true:false;
    }

    //Todos los getters
    
    public String getNombre(){
        return this.nombre;
    }

    public String getDni(){
        return this.dni;
    }

    public String getSexo(){
        return this.sexo;
    }

    public int getEdad(){
        return this.edad;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getAltura(){
        return this.altura;
    }

    //Todos los setters
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    //Método calcularImc
    
    public String calcularImc(){
        double pesoIdeal = this.peso / Math.pow(this.altura,2);
        return (pesoIdeal<20)?"bajo Peso":(20>=pesoIdeal & 25<=pesoIdeal)?"Ideal":"sobre Peso";
        
    }

    //Método toString
    
    public String toString(){
        return "+--------------------\n" + 
        "|" + " Persona"  + 
        "\n| \n|   nombre: " + this.nombre + "\n|   edad: " + this.edad +
        "\n|   dni: " + this.dni + "\n|   sexo: " + this.sexo + "\n|   peso: " + this.peso + "\n|   altura: " + this.altura + "\n+--------------------";
    }

    //Método main
    public static void main(String[] args) {
        String nombre;
        int edad;
        String dni;
        String sexo;
        double peso, altura;
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Marta", 14, "Mujer");
        Persona persona3 = new Persona("Mary", 35, "20111222X", "Mujer", 98.0, 1.65);
        
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce el nombre de la persona3:\t ");
        nombre = tec.next();

        System.out.print("Introduce la edad de la persona3:\t ");
        edad = tec.nextInt();

        System.out.print("Introduce el DNI de la persona3:\t ");
        dni = tec.next();
        
        System.out.print("Introduce el sexo de la persona3 (H/M):\t ");
        sexo = tec.next();

        System.out.print("Introduce el peso de la persona3 (Kg):\t ");
        nombre = tec.next();

        System.out.print("Introduce la altura de la persona3: (m)\t ");
        nombre = tec.next();
        
        System.out.println();
        System.out.println("La persona 1 tiene un IMC:\t "+persona1.calcularImc());
        System.out.println("La persona 2 tiene un IMC:\t "+persona2.calcularImc());
        System.out.println("La persona 3 tiene un IMC:\t "+persona3.calcularImc());

        System.out.println("¿La persona1 es mayor de edad?\t "+persona1.esMayorDeEdad());
        System.out.println("¿La persona2 es mayor de edad?\t "+persona2.esMayorDeEdad());
        System.out.println("¿La persona3 es mayor de edad?\t "+persona3.esMayorDeEdad());
        
        persona2.setPeso(40.0);
        persona2.setAltura(1.66);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
    
}
