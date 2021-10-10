package com.company;

class IntList {
    public int first;
    public IntList rest;

    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    public int get(int i) {
        if (i == 0) {
            return first;
        } else {
            return this.rest.get(i - 1);
        }
    }

    public int size() {
        if (rest == null) {
            return 1;
        } else {
            return 1 + this.rest.size();
        }
    }

    public int iterativeSize() {
        int count = 0;
        IntList p = this;

        while (p != null) {
            count += 1;
            p = p.rest;
        }

        return count;
    }
}

public class Main {

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);

        System.out.println(L.iterativeSize());
    }
}

