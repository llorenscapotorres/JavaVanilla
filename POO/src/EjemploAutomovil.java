import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Motor motorMazda =  new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45));

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));

        Automovil auto = new Automovil();
        Date fecha = new Date();

        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales con el equals customizado? " + (nissan.equals(nissan2)));
        System.out.println("-----------------");
        System.out.println(subaru.detalle());
        System.out.println("-----------------");
        System.out.println(mazda.detalle());
        System.out.println("-----------------");
        System.out.println(nissan.detalle());
        System.out.println("-----------------");
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println("-----------------");
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("------------------");
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 60));
        System.out.println("------------------");
        System.out.println(nissan);

    }
}
