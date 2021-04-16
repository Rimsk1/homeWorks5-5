package hw13.cars;

import java.util.Comparator;
import java.util.TreeSet;

public class CarCompairing {
        public static void main(String[] args) {

            // сортировать по значениям свойств: price, color, brand
            Car blackOpel = new Car("black", "opel", 2000);
            Car redOpel = new Car("red", "opel", 2500);
            Car yellowMazda = new Car("yellow", "mazda", 3000);
            Car greenMazda = new Car("green", "mazda", 3000);
            Comparator<Car> comparator = new Car.PriceComparator().thenComparing(new Car.ColorComparator())
                    .thenComparing(new Car.BrandComporator());
            TreeSet<Car> carTreeSet = new TreeSet<>(comparator);

            System.out.println(carTreeSet);

        }
    }

