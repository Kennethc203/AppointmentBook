public class Main {
    public static void main(String[] args){
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

    }
}
