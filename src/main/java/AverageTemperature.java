import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {
        System.out.println("How many day's temperatures?");
        Scanner scanner = new Scanner(System.in);
        int numOfDays = scanner.nextInt();
        int sum = 0;
        List<Integer> listOfTemperatures = new ArrayList<>();
        int count = 0;

        for (int i = 1; i <= numOfDays; i++) {
            System.out.println("Day " + i + "'s temperature");
            int temperature = scanner.nextInt();
            listOfTemperatures.add(temperature);
            sum += temperature;
        }

        int averageTemperature = sum / numOfDays;
        System.out.println();

        System.out.println("The average temperature is " + averageTemperature);

        for(Integer temp:listOfTemperatures) {
            if(temp > averageTemperature) {
                count++;
            }
        }

        System.out.println();
        System.out.printf("There are %s days above average temperature", count);

    }
}
