package by.pvt.abstr;


import by.pvt.abstr.auto.Auto;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Auto();
        machine.drive();
        machine.work();

        Auto auto=new Auto();
        auto.drive();
        auto.work();
        //((Car)auto).playMusic();

        Car car1=new Car();
        car1.playMusic();

        Auto auto2 = new Car();
            auto2.work();
            auto2.drive();
            ((Car) auto2).playMusic();//приведение типов

        Auto [] autos = {
                new Car(), new Auto()
        };

        Machine machine1 = new Auto();
        ((Machine)machine1).work();

        CdPlayer cdPlayer = new CdPlayer();
        cdPlayer.playMusic();
        cdPlayer.playMusic(50);

        Playable playable = new CdPlayer();
        playable.playMusic();
        playable.playMusic(100);

        Playable playable1 = new Car();
        playable.playMusic();
        playable.playMusic(200);
        //пример полиморфизма

        }
    }
