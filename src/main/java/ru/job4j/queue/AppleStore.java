package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer customer = null;
        for (int i = 1; i <= count; i++) {
            customer = queue.poll();
        }
        return customer == null ? "" : customer.name();
    }

    public String getFirstUpsetCustomer() {
        for (int i = 1; i <= count; i++) {
            queue.poll();
        }
        Customer customer = queue.peek();
        return customer == null ? "" : customer.name();
    }
}
