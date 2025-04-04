package fi.arcada.codechallenge;

import java.util.ArrayList;

public class Statistics {

    // Statisk metod for medelvärdet
    public static double calcMean(ArrayList<Double> data) {
        if (data == null || data.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (double number : data) {
            sum += number;
        }

        return sum / data.size();
    }
}