import java.util.Arrays;

public class EjemploAutomovilArreglos {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Andres", "Muelas");

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque(45));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);


        Persona pato = new Persona("Pato", "Rodriguez");

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(45));
        mazda.setConductor(pato);

        Persona bea = new Persona("Bea", "Gonzales");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(bea);

        Persona lalo = new Persona("Lalo", "Rivera");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS, new Motor(1.6, TipoMotor.DIESEL), new Estanque(50));
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente("Verde");
        suzuki.setConductor(lalo);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for(int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }

    }
}

