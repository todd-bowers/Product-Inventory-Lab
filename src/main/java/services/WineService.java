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

    public Wine findWine(int id) {
        for (Wine bottle : inventory) {
            if (bottle.getId() == id) return bottle;
        }
        return null;
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
