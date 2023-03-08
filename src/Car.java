public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Engine is started");
    }

    private void startElectricity() {
        System.out.println("Electricity is started");
    }

    private void startCommand() {
        System.out.println("Command is started");
    }

    private void startFuelSystem() {
        System.out.println("FuelSystem is started");
    }
}
