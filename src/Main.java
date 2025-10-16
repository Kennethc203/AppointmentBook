import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook somethingOrOther = new AppointmentBook(schedule);
        for(int i = 10; i < 15; i++) {schedule[1][i] = true;}
        for(int i = 30; i < 45; i++) {schedule[1][i] = true;}
        for(int i = 50; i < 60; i++) {schedule[1][i] = true;}
        somethingOrOther.printPeriod(2);
        schedule = new boolean[8][60];
        for(int i = 25; i < 30; i++) {schedule[1][i] = true;}
        for(int i = 0; i < 15; i++) {schedule[2][i] = true;}
        for(int i = 41; i < 59; i++) {schedule[2][i] = true;}
        for(int i = 5; i < 29; i++) {schedule[3][i] = true;}
        for(int i = 44; i < 60; i++) {schedule[3][i] = true;}
        AppointmentBook why = new AppointmentBook(schedule);
        for(int period = 2; period < 5; period++){
            System.out.println("Period: " + period + "\n");
            why.printPeriod(period);
        }
        why.printPeriod(4);
        why.makeAppointment(2, 4, 22);
        why.printPeriod(4);
         */
        AppointmentBook[] books = new AppointmentBook[1000];
        File paper = new File("schedules.txt");
        Scanner notPrinter = new Scanner(paper);
        boolean[][][] superSchedule = new boolean[1000][8][60];
        int totalAppointments = 0;
        int min;
        int hour;
        int periodBegin;
        int periodEnd;
        int periodMinutes;
        for (int i = 0; i < 1000; i++) {
            books[i] = new AppointmentBook(superSchedule[i]);
            min = 0;
            hour = 0;
            for (int j = 0; j <= 480; j++) {
                superSchedule[i][hour][min] = notPrinter.nextBoolean();
                min++;
                if (min == 60) {
                    min = 0;
                    hour++;
                    if (hour > 7) hour = 7;
                }


            periodBegin = notPrinter.nextInt();
            periodEnd = notPrinter.nextInt();
            periodMinutes = notPrinter.nextInt();
            if (books[i].makeAppointment(periodBegin, periodEnd, periodMinutes)) {
                totalAppointments++;
                }
            }
            System.out.println(totalAppointments);
        }
    }
}
