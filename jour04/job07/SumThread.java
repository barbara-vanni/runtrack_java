package jour04.job07;

public class SumThread implements Runnable {
    private int[] numbers;
    private int start;
    private int end;
    private int sum;
    private long executionTime;

    public SumThread(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.sum = 0;
        this.executionTime = 0;
    }

    @Override
    public void run() {
        long threadStartTime = System.currentTimeMillis();
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        long threadEndTime = System.currentTimeMillis();
        executionTime = threadEndTime - threadStartTime;
    }

    public int getSum() {
        return sum;
    }

    public long getExecutionTime() {
        return executionTime;
    }
}
