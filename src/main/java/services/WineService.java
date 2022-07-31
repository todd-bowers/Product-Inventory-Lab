package services;

import models.Sneaker;
import models.Wine;

import java.util.ArrayList;

public class WineService {

    private static int nextId = 1;
    private ArrayList<Wine> inventory = new ArrayList<>();

    public Wine create(String name, String type, int year, int qty, float price) {
        Wine createdWine = new Wine(nextId++, name, type, year, qty, price);
        inventory.add(createdWine);
        return createdWine;
    }

    public void updateQty(String name, int qty) {
        Wine wine = findWine(name);
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).equals(wine)) {
                Wine updated = new Wine(inventory.get(i).getId(), inventory.get(i).getName(), inventory.get(i).getType(), inventory.get(i).getYear(), qty, inventory.get(i).getPrice());
                inventory.set(i, updated);
            }
        }
    }
    public void updatePrice(String name, int price) {
        Wine wine = findWine(name);
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).equals(wine)) {
                Wine updated = new Wine(inventory.get(i).getId(), inventory.get(i).getName(), inventory.get(i).getType(), inventory.get(i).getYear(), inventory.get(i).getQty(), price);
                inventory.set(i, updated);
            }
        }
    }

    public Wine findWine(int id) {
        for (Wine bottle : inventory) {
            if (bottle.getId() == id) return bottle;
        }
        return null;
    }
    public Wine findWine(String name) {
        for (Wine bottle : inventory) {
            if (bottle.getName() == name) return bottle;
        }
        return null;
    }

    public String formattedString(Wine[] all) {
        StringBuilder formatted = new StringBuilder();
        for (Wine bottle : all) {
            formatted.append(bottle.toString() + " \n");
        }
        return String.valueOf(formatted);
    }

    public Wine[] findAll() {
        Wine[] result = new Wine[inventory.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = inventory.get(i);
        }
        return result;
    }

    public boolean delete(int id) {
        if (findWine(id) != null) {
            inventory.remove(findWine(id));
            return true;
        } else return false;
    }
}
