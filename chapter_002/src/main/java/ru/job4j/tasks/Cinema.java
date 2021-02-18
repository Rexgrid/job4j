package ru.job4j.tasks;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        Place place = null;
        for (int i = 0; i < places.length; i++) {
            for (int j = 1; j < places[i].length; j++) {
                if (places[i][j] == null) {
                    if (places[i][j - 1] == null && places[i + 1][j] == null) {
                        place = new Place(i, j);
                        break;
                    } else if (places[i][j - 1] == null && places[i + 1][j - 1] == null) {
                        place = new Place(i, j - 1);
                        break;
                    }
                }
                if (place != null) {
                    break;
                }
            }
        }
        return place;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}