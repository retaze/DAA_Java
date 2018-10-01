package hello;

public class CLaufzeit {

    private long start;
    private long stop;

    public CLaufzeit() {
        this.start = 0;
        this.stop = 0;
    }

    public void setStop() {
        this.stop = System.currentTimeMillis();
    }

    public void setStart() {
        this.start = System.currentTimeMillis();
    }

    public double getLaufzeit() {
        long swap;

        if (start > stop) {
            swap = start;
            start = stop;
            stop = swap;
        }
        return ((stop - start) / 1000.0);
    }
}
