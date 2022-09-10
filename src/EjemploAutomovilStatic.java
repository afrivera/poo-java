
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);

        // implementando Enum TipoAutomovil
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.AZUL, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
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
    }
}

