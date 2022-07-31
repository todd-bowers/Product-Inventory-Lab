package io;

import models.Wine;
import services.SneakerService;
import services.WineService;

public class App {
    private SneakerService sneakerService = new SneakerService();
    private WineService wineService = new WineService();
//    private final Console console = new Console();

    public static void main(String... args) {
        App application = new App();
        application.init();
    }

    public void init() {
        //Application logic goes here
        //Call methods to take user input and interface with services
        Console.printWelcome();

        createInventory(Console.getStringInput("Lets start off by stocking the store!\n" +
                "What would you like to add?"));
        menu();
        Console.printEnd();
    }

    public void menu() {
        boolean running = true;
        while (running) {
            String userInput = Console.getStringInput("What would you like to do?");
            if (userInput.equals("add")) {
                createInventory(Console.getStringInput("What would you like to add?"));
            } else if (userInput.equals("update")) {
                updateProducts(Console.getStringInput("Wine or sneakers?"));
            } else if (userInput.equals("quit")) {
                running = false;
            } else if (userInput.equals("delete")) {
                running = false;
            } else if (userInput.equals("read")) {
                read();
            }
        }
    }
    public void createInventory(String userInput) {
        if (userInput.equals("wine")) {
            String name = Console.getStringInput("Input name");
            String type = Console.getStringInput("Input type");
            Integer year = Console.getIntegerInput("Input year");
            Integer qty = Console.getIntegerInput("Input qty");
            Float price = Console.getFloatInput("Input price");
            wineService.create(name, type, year, qty, price);
            Console.print("Wine has been stocked!\n" + wineService.findWine(name).toString() + "\n");
        } else if (userInput.equals("sneaker") || userInput.equals("sneakers")) {
            String brand = Console.getStringInput("Input brand");
            String model = Console.getStringInput("Input model");
            String sport = Console.getStringInput("Input sport");
            Double year = Console.getDoubleInput("Input size");
            Integer qty = Console.getIntegerInput("Input qty");
            Float price = Console.getFloatInput("Input price");
            sneakerService.create(brand,model,sport,year,qty,price);
            Console.print("Sneaker has been stocked!\n" + sneakerService.findSneaker(model).toString() + "\n");
        }
    }
    public void updateProducts(String userInput) {
        if (userInput.equals("wine")) {
            String promptName = Console.getStringInput("What wine would you like to update?");

            String decision = Console.getStringInput("Would you like to update the qty, price, or both?");
            if (decision.equals("both")) {
                wineService.updateQty(promptName, Console.getIntegerInput("How many are now in the inventory?"));
                wineService.updatePrice(promptName, Console.getIntegerInput("What is the new price?"));
            } else if (decision.equals("qty")) {
                wineService.updateQty(promptName, Console.getIntegerInput("How many are now in the inventory?"));
            } else if (decision.equals("price")) {
                wineService.updatePrice(promptName, Console.getIntegerInput("What is the new price?"));
            }

        } else if (userInput.equals("sneaker") || userInput.equals("sneakers")) {
            String promptModel = Console.getStringInput("What model would you like to update?");
            String decision = Console.getStringInput("Would you like to update the qty, price, or both?");
            if (decision.equals("both")) {
                Integer promptQty = Console.getIntegerInput("How many are now in the inventory?");
                Integer promptPrice = Console.getIntegerInput("What is the new price?");
                sneakerService.findSneaker(promptModel).setQty(promptQty);
                sneakerService.findSneaker(promptModel).setPrice(promptPrice);
            } else if (decision.equals("qty")) {
                Integer promptQty = Console.getIntegerInput("How many are now in the inventory?");
                sneakerService.findSneaker(promptModel).setQty(promptQty);
            } else if (decision.equals("price")) {
                Integer promptPrice = Console.getIntegerInput("What is the new price?");
                sneakerService.findSneaker(promptModel).setPrice(promptPrice);
            }
        }
    }

    public void read() {
        Console.println(wineService.formattedString(wineService.findAll()));
        Console.println(sneakerService.formattedString(sneakerService.findAll()));
    }

}
