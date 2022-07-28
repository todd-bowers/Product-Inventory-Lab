package io;

import services.SneakerService;
import services.WineService;

public class App {
    private SneakerService sneakerService = new SneakerService();
    private WineService wineService = new WineService();
    private final Console console = new Console();

    public static void main(String... args) {
        App application = new App();
        application.init();
    }

    public void init() {
        //Application logic goes here
        //Call methods to take user input and interface with services
        console.printWelcome();

        createInventory(console.getStringInput("Lets start off by stocking the store!\n" +
                "What would you like to add?"));

    }


    public void createInventory(String userInput) {
        if (userInput.equals("wine")) {
            String name = Console.getStringInput("Input name");
            String type = Console.getStringInput("Input type");
            Integer year = Console.getIntegerInput("Input year");
            Integer qty = Console.getIntegerInput("Input qty");
            Float price = Console.getFloatInput("Input price");
            wineService.create(name, type, year, qty, price);
            console.print("Wine has been stocked!\n" + wineService.findWine(name).toString());
        } else if (userInput.equals("sneaker")) {
            String brand = Console.getStringInput("Input brand");
            String model = Console.getStringInput("Input model");
            String sport = Console.getStringInput("Input sport");
            Double year = Console.getDoubleInput("Input size");
            Integer qty = Console.getIntegerInput("Input qty");
            Float price = Console.getFloatInput("Input price");
            sneakerService.create(brand,model,sport,year,qty,price);
            console.print("Sneaker has been stocked!\n" + sneakerService.findSneaker(model).toString());
        }
    }
}
