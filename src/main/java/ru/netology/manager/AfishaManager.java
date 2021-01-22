package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaManager {
    private Movie[] items = new Movie[0];
    private int itemsToShow;

    public AfishaManager(int itemsToShow) {
        this.itemsToShow = itemsToShow;
    }

    public void add(Movie item) {

        int length = items.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Movie[] showLastAddedItems() {
        int length = itemsToShow;

        if (itemsToShow < 0) {
            length = 0;
        }
        if (length > items.length) {
            length = items.length;
        }
        Movie[] result = new Movie[length];
        for (int i = 0; i < length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}