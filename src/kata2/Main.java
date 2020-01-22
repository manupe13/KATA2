package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(2,3,1,2,-4,8,3,5,5,-4,-1);
        new ConsoleHistogramDisplay().show(histogram);
    }
    
}
