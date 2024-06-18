package jour04.job08;

public class SumThread implements Runnable {
    private int start;
    private int end;
    private long sum;
    private long executionTime;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
        this.executionTime = 0;
    }

    @Override
    public void run() {
        long threadStartTime = System.currentTimeMillis();
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        long threadEndTime = System.currentTimeMillis();
        executionTime = threadEndTime - threadStartTime;
    }

    public long getSum() {
        return sum;
    }

    public long getExecutionTime() {
        return executionTime;
    }
}
