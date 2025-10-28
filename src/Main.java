import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{

        boolean[][] schedule = new boolean[8][60];
        AppointmentBook somethingOrOther = new AppointmentBook(schedule);
        for(int i = 10; i < 15; i++) {schedule[1][i] = true;}
        for(int i = 30; i < 45; i++) {schedule[1][i] = true;}
        for(int i = 50; i < 60; i++) {schedule[1][i] = true;}
        somethingOrOther.printPeriod(2);
        System.out.println(somethingOrOther.findFreeBlock(2, 15) + somethingOrOther.findFreeBlock(2, 9) + somethingOrOther.findFreeBlock(2, 20));
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
        System.out.println(why.makeAppointment(2, 4, 22));
        System.out.println(why.makeAppointment(3, 4, 3));
        System.out.println(why.makeAppointment(2, 4, 30));
        why.printPeriod(4);






        AppointmentBook[] books = new AppointmentBook[1000];
        File paper = new File("schedules.txt");
        Scanner notPrinter = new Scanner(paper);
        SupaList[] moreSchedules = new SupaList[1000];
        int appointmentCount = 0;

        for (int i = 0; i < 1000; i++) {
            moreSchedules[0] = new SupaList();
            books[0] = new AppointmentBook(moreSchedules[0].notSupaList);
            int min = 0;
            int hour = 0;
            for (int j = 0; j < 484; j++) {
                if (notPrinter.hasNextBoolean()) {
                    moreSchedules[0].notSupaList[hour][min] = notPrinter.nextBoolean();
                    min++;
                    if (min > 59) {
                        min = 0;
                        hour++;
                    }
                }
            }
            if (notPrinter.hasNextInt()) {
                int begin = notPrinter.nextInt();
                int end = notPrinter.nextInt();
                int duration = notPrinter.nextInt();
                boolean val = books[0].makeAppointment(begin, end, duration);
                if (val) {
                    appointmentCount++;
                }

            }
        }
        System.out.println(appointmentCount);

        //Mr. Holmer's Method
        System.out.println(AppointmentBook.read());


    }
    }
