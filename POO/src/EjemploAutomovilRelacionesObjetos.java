public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martínez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSubaru);
        Rueda[] ruedasSubaru = new Rueda[5];
        for (int i = 0; i < ruedasSubaru.length; i++){
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Rueda[] ruedasMazda = {new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5)};
        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMazda);

        Persona bea = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(bea);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));


        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};
        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.NARANJA,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50), lalo, ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.NEGRO);

        Automovil.setColorPatente(Color.AZUL);
        Automovil auto = new Automovil();

        System.out.println("-----------------");
        System.out.println(subaru.detalle());
        System.out.println("-----------------");
        System.out.println(mazda.detalle());
        System.out.println("-----------------");
        System.out.println(nissan.detalle());
        System.out.println("-----------------");
        System.out.println(nissan2.detalle());
        System.out.println("-----------------");

    }
}
