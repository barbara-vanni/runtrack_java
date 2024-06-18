package jour04.job05;

public class CounterThread implements Runnable {
    private int start;
    private int end;
    private int count;
    private long executionTime;

    public CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = start; i <= end; i++) {
            count++;
        }
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }

    public int getCount() {
        return count;
    }

    public long getExecutionTime() {
        return executionTime;
    }
}
