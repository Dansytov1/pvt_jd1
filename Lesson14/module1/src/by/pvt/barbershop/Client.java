package by.pvt.barbershop;

public class Client implements Runnable {

    private BarberShop barberShop;

    public void setBarberShop(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        try {
                if (barberShop.isOpen()) {
                    barberShop.newClient();
                } else {
                    System.out.println("Client: Barbershop is close");
                }
                Thread.sleep(3000);
                    } catch (Exception e) {
            e.printStackTrace();
        }
    }
}