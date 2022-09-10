
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "rojo", 3.0);
        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

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

    }
}

