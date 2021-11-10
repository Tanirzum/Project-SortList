import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<House> list = Arrays.asList(
                new House("apartment", 3, 2132.123),
                new House("privateHouse", 1, 120.00),
                new House("apartment1", 8, 21312.21),
                new House("privateHouse1", 2, 1231.123));
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Как хотите сортировать?
                1.Сортировка по айди 
                2.Сортировка по прайс
                3.Сортировка по именованию""");
        String value = scanner.next();

        switch (Integer.parseInt(value)) {
            case 1 -> {
                Comparator<House> comparator = new idComparator();
                list.sort(comparator);
                for (House element : list) {
                    System.out.println(element);
                }
            }
            case 2 -> {
                Comparator<House> comparator1 = new priceCompartor();
                list.sort(comparator1);
                for (House element : list) {
                    System.out.println(element);
                }
            }
            case 3 -> {
                Collections.sort(list);
                for (House element : list) {
                    System.out.println(element);
                }
            }
        }
    }
}
