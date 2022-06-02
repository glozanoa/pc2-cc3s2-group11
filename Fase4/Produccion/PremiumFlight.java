public class PremiumFlight extends Flight {

  // Diseno inicial de la clase  PremiumFlight. Pregunta 5
    public PremiumFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        if (passenger.isVip())
            return passengers.add(passenger);
        else
            return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        passengers.remove(passenger);
        return true;
    }

}

