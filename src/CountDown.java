import java.text.DecimalFormat;

public class CountDown {
    private static long totalTimeSec;
    private static long perSec = 1000;
    
    public static void bySleep(int totalTime)throws InterruptedException {
        totalTimeSec = totalTime * 60;
        for(long i = totalTimeSec; i >= 0; i--){
            Thread.sleep(perSec);
            ShowTime.remainTime(i);
        }
    }
}

class ShowTime{
    public static void remainTime(long timeSec){
    long min = timeSec/60;
    long sec = timeSec%60;

    DecimalFormat df = new DecimalFormat("00");
    System.out.println(df.format(min) + ":" + df.format(sec));
    }
}

