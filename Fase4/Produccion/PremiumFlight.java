public class PremiumFlight extends Flight {

  // Diseno inicial de la clase  PremiumFlight. Pregunta 5
    public PremiumFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
            return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return false;
    }

}

