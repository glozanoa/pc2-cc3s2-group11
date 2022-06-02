public class PremiumFlight extends Flight {

    public PremiumFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        if (passenger.isVip)
            return true;
        else
            false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return true;
    }


}

