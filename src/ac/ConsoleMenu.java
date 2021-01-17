package ca;

import java.util.Scanner;

public class ConsoleMenu {

    //region Public Methods
    public void start() {
        int menuSelection;
        CarManager cm = new CarManager();

        do {
            showMenu();
            menuSelection = selectedMenuItem();

            switch (menuSelection) {
                case 1:
                    String[] cars = cm.listAllCars();
                    for (int i = 0; i < cars.length; i++) {
                        System.out.println(cars[i]);
                    }
                    break;
                case 2:
                    String[] rentedCars = cm.listRentedCars();
                    for (int i = 0; i < rentedCars.length; i++) {
                        System.out.println(rentedCars[i]);
                    }
                    break;
                case 3:
                    String[] availableCars = cm.listAvailableCars();
                    for (int i = 0; i < availableCars.length; i++) {
                        System.out.println(availableCars[i]);
                    }
                    break;
                case 4:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Bitte geben Sie die Marke an: ");
                    String brand = sc.next();
                    System.out.print("Bitte geben Sie die Type an: ");
                    String type = sc.next();
                    System.out.print("Geben Sie die PS des Autos an: ");
                    short hp = sc.nextShort();
                    cm.addCar(brand,type,hp);
                    break;
                case 0:
                    System.out.println("Bye");
            }
        } while (menuSelection != 0);
    }
    //endregion

    //region Private Methods
    private void showMenu() {
        System.out.println();
        System.out.println("Menüauswahl:");
        System.out.println();
        System.out.println("1 ... Anzeigen aller Autos");
        System.out.println("2 ... Anzeigen der verliehenen Autos");
        System.out.println("3 ... Anzeigen der verfügbaren Autos");
        System.out.println("4 ... Auto hinzufügen");
        System.out.println("0 ... Beenden");
        System.out.println();
    }

    private int selectedMenuItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ihre Auswahl: ");
        return sc.nextInt();
    }

    //endregion
}
