package by.pvt.barbershop;

public class Barber implements Runnable{

    private BarberShop barberShop;

    public Barber(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        try {
            barberShop.setOpen(true);
            boolean isParfumeEmpty = barberShop.isParfumeEmpty();
            while (!isParfumeEmpty){
                barberShop.makeHairDress();
                Thread.sleep(10000);
                isParfumeEmpty=barberShop.isParfumeEmpty();
            }
                barberShop.setOpen(false);

            } catch(Exception e){
                e.printStackTrace();
            }
    }
}
