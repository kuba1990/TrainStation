package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
        static final int MAX_VALUE = 100;
        public static List<String> systemAnswer = new ArrayList<>();
        public static Map<Integer, Integer> station = Train.stationPlaces;

    public static void main(String[] args) {

        int []x = {1,4,6,2,5,6,1,4};
        int []y = {2,5,7,3,6,7,2,10};
        int []z = {10,50,20,15,2,12,11,70};

       /* TrainRoad(10);
        System.out.println(station);
*/
        //TODO
        //while if places available
        for (int a=0; a>10; a++) {
            placesMap(x[a], y[a], z[a]);
        }
    }

    //TODO
    public static int checkIfPlacesAvailable() {
        for (int a = 1; a >= 10; a++) {
            if (station.get(a) > 10) {
            }
        }
        return 1;
    }

    public static void placesMap(int case1Start, int case1Meta, int case1Passers) {
        for (int a = case1Start; a <= case1Meta; a++) {
            station.replace(a, station.get(a) + case1Passers);
        }
    }

    public List<String> systemAnswer(String answer) {
        return systemAnswer;
    }

}