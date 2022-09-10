public class Automovil {
    // no lleva main
    // - Atributos
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    // implementando asociaciones
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    // atributos estaticos no pertenece a la instancia, atributo generico
    private static String colorPatente = "Naranja";
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    // atributo constante comunmente son publicas, siempre se debe definir el valor
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAXIMA_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    // un atributo estatico debe tener get y set staticos
    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public Automovil(){
        this.id = ++ultimoId;
    }
    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    // funciones o métodos
    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("id = " + this.getId());
        sb.append("\nFabricante: " + this.getFabricante());
        sb.append("\nmodelo: " + this.getModelo());
        sb.append("\nTipo: " + this.getTipo().getNombre());
        sb.append("\ncolor: " + this.color.getColor());
        sb.append("\ncilindrada: " + this.motor.getCilindrada());
        sb.append("\ncolorPatente: " + Automovil.colorPatente);

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
        return km / (porcentajeBencina* this.estanque.getCapacidad());
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (porcentajeBencina* (this.estanque.getCapacidad() / 100f));
    }

    // en un metodo estatico solo se pueden manejar atributos estaticos o propios del método
    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km / (Automovil.capacidadTanqueEstatico * (porcentajeBencina / 100f));
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
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadTanque=" + estanque.getCapacidad() +
                '}';
    }


}
