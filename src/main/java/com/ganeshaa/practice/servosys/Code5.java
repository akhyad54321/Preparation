package com.ganeshaa.practice.servosys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Hotel {
    String name;
    String rateType;
    int weekDayRate;
    int weekendRate;
    int rating;

}
public class Code5 {
    public static void main(String[] args) {
        List<Hotel> hotels = List.of(
                new Hotel("Taj", "REGULAR", 120, 110, 2),
                new Hotel("Taj", "REWARD", 105, 95, 2),
                new Hotel("Radisson", "REGULAR", 110, 100, 3),
                new Hotel("Radisson", "REWARD", 100, 90, 3),
                new Hotel("Oyo", "REGULAR", 130, 90, 4),
                new Hotel("Oyo", "REWARD", 90, 80, 4)
        );

        String[] input1 = {"REGULAR", "18 MAY 2021(WED)", "19 MAY 2021(THU)", "21 MAY 2021(SAT)"};
        String[] input2 = {"REWARD", "19 MAY 2021(THU)", "20 MAY 2021(FRI)", "21 MAY 2021(SAT)", "22 MAY 2021(SUN)"};

        System.out.println(getCheapestHotel(hotels, input1));
        System.out.println(getCheapestHotel(hotels, input2));
    }

    public static String getCheapestHotel(List<Hotel> hotels, String[] input) {
        String rateType = input[0];
        System.out.println("rateType = " + rateType);
        List<String> dates = Arrays.asList(input).subList(1, input.length);
        System.out.println("dates = " + dates);

        return hotels.stream()
                .filter(hotel -> hotel.rateType.equals(rateType)) // Filter hotels based on rate type
                .min(Comparator.comparingInt((Hotel hotel) ->
                                dates.stream()
                                        .mapToInt(date -> isWeekend(date) ? hotel.weekendRate : hotel.weekDayRate)
                                        .sum())
                        .thenComparing((Hotel hotel) -> -hotel.rating)) // Tiebreaker: prioritize higher rating
                .orElseThrow(() -> new IllegalArgumentException("No hotel found"))
                .name;
    }

    public static boolean isWeekend(String date) {
        return date.contains("SAT") || date.contains("SUN");
    }
}
