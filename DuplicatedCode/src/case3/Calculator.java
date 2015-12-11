package case3;

import java.util.stream.IntStream;

public class Calculator {

    public long sum(Range range) {
       return evaluate(range, i -> i);
    }

    public long sumOfSquares(Range range) {
        return evaluate(range, i -> i * i);
    }

    private long evaluate(Range range, Function function){
        return IntStream.range(range.min(),range.max()+1).mapToLong(i -> function.evaluate(i)).sum();
    }

    public interface Function{
        long evaluate(long value);
    }

}

