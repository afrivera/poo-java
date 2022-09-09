public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.asignarFabricante( "Subaru");
        auto.asignarModelo("Impreza");
        auto.asignarCilindrada(2.0);

        Automovil mazda = new Automovil();
        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("BT-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("Rojo");

//        System.out.println("auto.fabricante = " + auto.fabricante); // is null ya que no se ha iniciado
//        System.out.println("auto.modelo = " + auto.modelo);
//        System.out.println("auto.color = " + auto.color);
//        System.out.println("auto.cilindrada = " + auto.cilindrada);
        String detalle = auto.detalle();
        System.out.println(detalle);
        System.out.println();
//        System.out.println("mazda.fabricante = " + mazda.fabricante);
//        System.out.println("mazda.modelo = " + mazda.modelo);
//        System.out.println("mazda.color = " + mazda.color);
//        System.out.println("mazda.cilindrada = " + mazda.cilindrada);
        String detalle2 = mazda.detalle();
        System.out.println(detalle2);
        System.out.println(auto.acelerar(5000));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(3000));

        System.out.println("kilometros por litro= " +  auto.calcularConsumo(300, 0.6f));
        System.out.println("kilometros por litro= " +  auto.calcularConsumo(300, 60));

    }
}

