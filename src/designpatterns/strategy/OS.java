package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class OS {
    List<Page> pages = new ArrayList<>();
    List<AddPageEventSubscriber> addPageEventSubscribers = new ArrayList<>();
    PageReplacementStrategy strategy;

    OS(PageReplacementAlgoType algo) {
        strategy = PageReplacementStrategyFactory.getStrategyForAlgoType(algo, this);
    }

    void registerAddPageEventSubscriber(AddPageEventSubscriber addPageEventSubscriber) {
        this.addPageEventSubscribers.add(addPageEventSubscriber);
    }

    void unregisterAddPageEventSubscriber(AddPageEventSubscriber addPageEventSubscriber) {
        this.addPageEventSubscribers.remove(addPageEventSubscriber);
    }

    void addPage(Page page) {
        this.pages.add(page);

        for (AddPageEventSubscriber addPageEventSubscriber: addPageEventSubscribers) {
            addPageEventSubscriber.onAddPage(page);
        }
    }

    void doCleanUp() {
        strategy.replace();
    }
}
