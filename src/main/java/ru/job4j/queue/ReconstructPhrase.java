package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        String rsl = "";
        StringBuilder one = new StringBuilder();
        int le = evenElements.size();
        for (int i = 0; i < le; i++) {
            if (i % 2 == 0) {
                one.append(evenElements.pollFirst());
            } else {
                evenElements.pop();
            }
        }
        rsl = one.toString();
        return rsl;
    }

    private String getDescendingElements() {
        String rsl = "";
        StringBuilder one = new StringBuilder();
        int le = descendingElements.size();
        for (int i = 0; i < le; i++) {
            one.append(descendingElements.pollLast());
        }
        rsl = one.toString();
        return rsl;
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}