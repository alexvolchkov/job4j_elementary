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
        String result = "";
        Customer customer = null;
        for (int i = 1; i <= count; i++) {
            customer = queue.poll();
            if (customer == null) {
                break;
            }
        }
        if (customer != null) {
            result = customer.name();
        }
        return result;
    }

    public String getFirstUpsetCustomer() {
        String result = "";
        for (int i = 1; i <= count; i++) {
            if (queue.poll() == null) {
                break;
            }
        }
        Customer customer = queue.peek();
        if (customer != null) {
            result = customer.name();
        }
        return result;
    }
}
