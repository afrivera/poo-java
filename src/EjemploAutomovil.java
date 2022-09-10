import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru", "Impreza");
        Date date = new Date();

        auto.setCilindrada(2.0);

        Automovil mazda = new Automovil("Mazda", "BT-50", "rojo", 3.0);

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        Automovil automovil = new Automovil();

        // comparando diferentes objetos
        System.out.println(nissan.equals(date));
        System.out.println(nissan); // tostring implicita
        System.out.println(nissan.toString()); // tostring explicita


        System.out.println("son iguales= " + (nissan == nissan2));
        System.out.println("son iguales equals= " + (nissan.equals(nissan2)));
        System.out.println("son iguales equals= " + (automovil.equals(nissan)));
        System.out.println(auto.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println();
        System.out.println(nissan.detalle());
        System.out.println();
        System.out.println(auto.acelerar(5000));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(3000));

        System.out.println("kilometros por litro= " +  auto.calcularConsumo(300, 0.6f));
        System.out.println("kilometros por litro= " +  mazda.calcularConsumo(300, 60));
        System.out.println("kilometros por litro= " +  nissan.calcularConsumo(300, 60));

    }
}

