public class Automovil {
    // no lleva main
    // - Atributos
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadTanque = 40;


    public Automovil(){}
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    // funciones o métodos
    public String detalle(){
        // dentro de una clase nunca debería imprimirse
//        System.out.println("fabricante = " + this.fabricante);
//        System.out.println("modelo = " + this.modelo);
//        System.out.println("color = " + this.color);
//        System.out.println("cilindrada = " + this.cilindrada);
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: " + this.getFabricante());
        sb.append("\nmodelo: " + this.getModelo());
        sb.append("\ncolor: " + this.color);
        sb.append("\ncilindrada: " + this.cilindrada);
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " accelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km / (porcentajeBencina* this.capacidadTanque);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (porcentajeBencina* (this.capacidadTanque / 100f));
    }

    // override de method equals
    @Override
    public boolean equals(Object obj) {
        if( this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante !=null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    // representar el objeto de salida en un string
    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
