package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {

    public static List<String> systemAnswer = new ArrayList<>();
    public static Map<Integer, Integer> station = Train.stationPlaces;

    public static void main(String[] args) {
        int a[] = {
                4, 6, 4,
                1, 4, 2,
                1, 3, 2,
                2, 4, 3,
                1, 2, 3};

        int stationQuantity = a[0]; //4
        int numberOfPlaces = a[1]; //6
        int numberOfRequest = a[2]; //4

        TrainRoad(stationQuantity);


        for (int z = 1; z <= numberOfRequest; z++) {
            placesMap(a[3 * z], a[(3 * z) + 1], a[(3 * z) + 2]);
            System.out.println(station);
            if (createOutputSystem() <= numberOfPlaces)
                systemAnswer.add("yes");
            else systemAnswer.add("no");
        }
        //checking:
        for (int x = 0; x <= numberOfRequest - 1; x++) {
            System.out.println(systemAnswer.get(x));
        }
    }

    private static int createOutputSystem() {
        int maxValueInMap = (Collections.max(station.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : station.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {

            }
        }
        System.out.println("MAX VALUE" + maxValueInMap);
        return maxValueInMap;
    }

    //create Road
    private static void TrainRoad(int stationNumber) {
        for (int a = 0; a <= stationNumber; a++) {
            station.put(a, 0);
        }
    }
    //Train run
    private static void placesMap(int startStationNumber, int endStationNumber, int passagersNumber) {
        for (int a = startStationNumber; a <= endStationNumber; a++) {
            station.put(a, station.get(a) + passagersNumber);

        }
    }

    public List<String> systemAnswer(String answer) {
        return systemAnswer;
    }
}