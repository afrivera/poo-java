
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque(45));
        subaru.setColor(Color.BLANCO);

        // implementando Enum TipoAutomovil
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.0, TipoMotor.DIESEL));
//        mazda.setEstanque(new Estanque(45)); si lanza error por no tener asignado
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL), new Estanque(50));
        nissan2.setTipo(TipoAutomovil.PICKUP);
        // modificaría el patente static para todos
//        Automovil.colorPatente = "Verde";
        Automovil.setColorPatente("Verde");

        Automovil subarumovil = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        // get atributo estatico
        System.out.println("Automovil.getColorPatente: " +Automovil.getColorPatente());

        System.out.println("Kilometros por litro Estatico = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad max carretera: " +Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad max ciudad: " +Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        // enum no se instancia pero tiene sus metodos
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo desc subaru: " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));
    }
}

