import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть вибір напою (coffee, tea, lemonade, mojito, mineralwater, cocacola): ");
        String drinksChoice = scanner.nextLine().toLowerCase();
        DrinksMachine chosenDrink = DrinksMachine.valueOf(drinksChoice.toUpperCase());

        System.out.print("Введіть кількість: ");
        int quantityOrdered = scanner.nextInt();

        switch (chosenDrink) {
            case COFFEE:
                DrinkMaker.makeCoffee(quantityOrdered);
                break;
            case TEA:
                DrinkMaker.makeTea(quantityOrdered);
                break;
            case LEMONADE:
                DrinkMaker.makeLemonade(quantityOrdered);
                break;
            case MOJITO:
                DrinkMaker.makeMojito(quantityOrdered);
                break;
            case MINERALWATER:
                DrinkMaker.makeMineralWater(quantityOrdered);
                break;
            case COCACOLA:
                DrinkMaker.makeCocaCola(quantityOrdered);
                break;
            default:
                System.out.println("Неправильний вибір напою");
        }

        double totalCost = calculateTotalCost(chosenDrink, quantityOrdered);
        System.out.println("Загальна вартість: $" + totalCost);

        scanner.close();
    }

    private static double calculateTotalCost(DrinksMachine drink, int quantity) {
        double unitPrice;

        switch (drink) {
            case COFFEE:
                unitPrice = Drinks.COFFEE_PRICE;
                break;
            case TEA:
                unitPrice = Drinks.TEA_PRICE;
                break;
            case LEMONADE:
                unitPrice = Drinks.LEMONADE_PRICE;
                break;
            case MOJITO:
                unitPrice = Drinks.MOJITO_PRICE;
                break;
            case MINERALWATER:
                unitPrice = Drinks.MINERALWATER_PRICE;
                break;
            case COCACOLA:
                unitPrice = Drinks.COCACOLA_PRICE;
                break;
            default:
                throw new IllegalArgumentException("Неправильний вибір напою");
        }

        return unitPrice * quantity;
    }
}
