public class Main{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(20);
        cliente1.setNombre("Pablo");
        cliente1.setTelefono(91234567);
        cliente1.setCredito(1000);

        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getCredito());        

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(30);
        trabajador1.setNombre("Pedro");
        trabajador1.setTelefono(86549789);
        trabajador1.setSalario(2000);
        
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getEdad());
        System.out.println(trabajador1.getTelefono());
        System.out.println(trabajador1.getSalario());
    }

}

class Persona{
    public int edad;
    public String nombre;
    public int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}

class Cliente extends Persona{
    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
