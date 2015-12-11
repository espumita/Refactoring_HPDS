package case3;

public interface Range {
    int min();
    int max();

    static Edition from(int from){
        return to -> new Range() {
            @Override
            public int min() {
                return from;
            }
            @Override
            public int max() {
                return to;
            }
        };
    }

    interface Edition{
        Range to(int to);
    }
}
