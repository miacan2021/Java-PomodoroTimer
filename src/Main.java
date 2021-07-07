public class Main {
    public static void main(String[] args) throws InterruptedException{
        SetTimer timer = new SetTimer();
        int times = timer.getPomodoroNum();
        int breakTime = timer.getBreakTime();
        int pomodoro = timer.getPomodoroTime();
      
        for(int i = 1; i <= times; i++){     
            if(i == times){
                System.out.println("*****************");
                System.out.println("Start:"+pomodoro+"min("+i+")");
                System.out.println("*****************");
                CountDown.bySleep(pomodoro);   
                System.out.println("*****************");
                System.out.println("You studied "+(pomodoro*times)+"min.");
                System.out.println("*****************");
            }else{
                System.out.println("*****************");
                System.out.println("Start:"+pomodoro+"min("+i+")");
                System.out.println("*****************");
                CountDown.bySleep(pomodoro);   
                System.out.println("*****************");
                System.out.println("Break:"+breakTime+"min("+i+")");
                System.out.println("*****************");
                CountDown.bySleep(breakTime);
            }            
        }
    }
}


