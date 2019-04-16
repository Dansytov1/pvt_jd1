public class Task3_1 {
        public static void main(String[] args) {
            int s = 2500;
            int sec;
            int m;
            int min, h, day, week, d;
            sec = s % 60;
            m = (s -sec) / 60;
            min = m % 60;
            h = (m -min) / 60;
            day = h%24;
            d=(h-day)/24;
            week=d%7;
            System.out.println(week+" недель, "+day+" дней, "+h+" часов, " + min + " минут, " + sec + " секунд");

        }
    }
