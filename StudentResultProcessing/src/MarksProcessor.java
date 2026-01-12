public class MarksProcessor {

    public double calculatePercent(String[] marks) throws IllegalArgumentException, NullPointerException {

        int total = 0;
        int value = 0;
        int size = marks.length;

        if (size == 0) {
            String e;
            throw new NullPointerException();
        }

        double percentage = 0;
        for (int i = 0; i < marks.length; i++) {

            value = Integer.parseInt(marks[i]);

            if (value < 0 || value > 100)
                throw new IllegalArgumentException();
            total += value;
        }

        percentage = total / size;
        return percentage;
    }

}





