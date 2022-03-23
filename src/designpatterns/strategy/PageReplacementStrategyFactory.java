package designpatterns.strategy;

public class PageReplacementStrategyFactory {

    public static PageReplacementStrategy getStrategyForAlgoType(
            PageReplacementAlgoType algoType, OS os
    ) {
        return switch (algoType) {
            case LFU -> new LFUPageReplacementStrategy();
            case LRU -> new LRUPageReplacementStrategy();
            case FIFO -> new FIFOPageReplacementStrategy(os);
            default -> null;
        };

    }
}
