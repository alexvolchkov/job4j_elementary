package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    private Customer pool() {
        Customer customer = null;
        for (int i = 1; i <= count; i++) {
            customer = queue.poll();
            if (customer == null) {
                break;
            }
        }
        return customer;
    }

    public String getLastHappyCustomer() {
        String result = "";
        Customer customer = pool();
        if (customer != null) {
            result = customer.name();
        }
        return result;
    }

    public String getFirstUpsetCustomer() {
        String result = "";
        pool();
        Customer customer = queue.peek();
        if (customer != null) {
            result = customer.name();
        }
        return result;
    }
}
