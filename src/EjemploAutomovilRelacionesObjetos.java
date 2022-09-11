
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Andres", "Muelas");

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque(45));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
//        subaru.setRuedas(ruedasSub);
        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }


        Persona pato = new Persona("Pato", "Rodriguez");

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(45));
        mazda.setConductor(pato);
//        mazda.setRuedas(ruedaMaz);
        Rueda[] ruedaMaz = new Rueda[5];
        for (int i = 0; i < ruedaMaz.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        Persona bea = new Persona("Bea", "Gonzales");

        Automovil nissan = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(bea);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5)).addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));

        Persona lalo = new Persona("Lalo", "Rivera");
        Rueda[] ruedaNiss2 = new Rueda[5];
        for (int i = 0; i < ruedaNiss2.length; i++) {
            ruedaNiss2[i] = new Rueda("Pirelli", 20, 11.5);
        }
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL), new Estanque(50), lalo, ruedaNiss2);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente("Verde");


        Automovil subarumovil = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println("Conductor: " +subaru.getConductor().toString());
        // Ruedas subaru
        for(Rueda r: subaru.getRuedas()){
            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }
    }
}

