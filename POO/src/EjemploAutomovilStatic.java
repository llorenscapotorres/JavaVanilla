public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.NARANJA, new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.NEGRO);

        Automovil.setColorPatente(Color.AZUL);
        Automovil auto = new Automovil();

        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales con el equals customizado? " + (nissan.equals(nissan2)));
        System.out.println("-----------------");
        System.out.println(subaru.detalle());
        System.out.println("-----------------");
        System.out.println(mazda.detalle());
        System.out.println("-----------------");
        System.out.println(nissan.detalle());
        System.out.println("-----------------");
        System.out.println(nissan2.detalle());
        System.out.println("-----------------");
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilómetros por litros = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad máxima en carretera: " +  Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima en ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);
        System.out.println("-----------------");

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo desc. subaru: " + tipoSubaru.getDescripcion());
        System.out.println(tipoSubaru);

    }
}
