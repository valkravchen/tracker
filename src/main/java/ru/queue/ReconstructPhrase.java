package ru.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements,
                             Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder sb = new StringBuilder();
        int originalSize = evenElements.size();
        for (int index = 0; index < originalSize / 2; index++) {
            sb.append(evenElements.pollFirst());
            evenElements.pollFirst();
        }
        return sb.toString();
    }

    private String getDescendingElements() {
        StringBuilder sb = new StringBuilder();
        int originalSize = descendingElements.size();
        for (int index = 0; index < originalSize; index++) {
            sb.append(descendingElements.pollLast());
        }
        return sb.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
