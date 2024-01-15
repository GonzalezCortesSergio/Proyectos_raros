package componentes;

public class Jugador {

    //Atributos
    private String nombre;
    private int clase;
    private double vida;
    private double ataque;
    private double inteligencia;
    private double defensa;
    private double velocidad;

    //Constructor
    public Jugador (String nombre, int clase, double vida, double ataque, double inteligencia, double defensa, double velocidad) {

        this.nombre = nombre;
        this.clase = clase;
        this.vida = vida;
        this.ataque = ataque;
        this.inteligencia = inteligencia;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    //Getters and Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Jugador [nombre: " + nombre + ", clase: " + clase + ", vida: " + vida +
                ", ataque: " + ataque + ", inteligencia: " + inteligencia + ", defensa: "
                + defensa + ", velocidad: " + velocidad;
    }
}
