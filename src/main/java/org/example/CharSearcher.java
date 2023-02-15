package org.example;

import java.util.stream.IntStream;

public class CharSearcher {

    private char[] data;

    CharSearcher(char[] arr) {
        this.data = arr;
    }

    int getPositionOfChar(char c) {
        int n = data.length;
        for (int p = 0; p < n; p++) {
            if (data[p] == c)
                return p;
        }
        return -1;
        // return IntStream.range(0, data.length).filter(i -> c == data[i]).findFirst().orElse(-1);
    }
}