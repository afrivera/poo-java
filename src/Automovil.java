public class Automovil {
    // no lleva main
    // - Atributos
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadTanque = 40;

    public String leerFabricante(){
        return this.fabricante;
    }

    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String leerModelo(){
        return this.modelo;
    }

    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }

    public String leerColor(){
        return this.color;
    }

    public void asignarColor(String color){
        this.color = color;
    }

    public double leerCilindrada(){
        return this.cilindrada;
    }

    public void asignarCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int leerCapacidadTanque(){
        return this.capacidadTanque;
    }

    public void asignarCapacidadTanque(int capacidadTanque){
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
        sb.append("Fabricante: " + this.fabricante);
        sb.append("\nmodelo: " + this.modelo);
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

}
