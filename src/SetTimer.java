import java.util.Scanner;

public class SetTimer {
    Scanner scanner = new Scanner(System.in);
    private int pomodoroTime;
    private int breakTime;
    private int pomodoroNum;
    
    public SetTimer() {
        try{
            System.out.println("--------------------------------------");
            System.out.print("Enter the time (in minutes) for the Pomodoro:");
            pomodoroTime = scanner.nextInt();
            System.out.println("--------------------------------------");
            System.out.print("Enter the time (in minutes) for break:");
            breakTime = scanner.nextInt();
            System.out.println("--------------------------------------");
            System.out.print("Enter the number of pomodoro:");
            pomodoroNum = scanner.nextInt();
            System.out.println("--------------------------------------");
            }catch(Exception e){
                System.out.println("***********************************************");
                System.out.println("Wrong input! Input only integer numbers please...");
                System.out.println("***********************************************");
            }
    }
    public int getPomodoroTime() {
        return pomodoroTime;
    }
    public int getBreakTime() {
        return breakTime;
    }
    public int getPomodoroNum() {
        return pomodoroNum;
    }
}
    
    