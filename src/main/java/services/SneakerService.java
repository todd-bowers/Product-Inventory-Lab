package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {
    private static int nextId = 1;
    private ArrayList<Sneaker> inventory = new ArrayList<>();

    public Sneaker create(String brand, String model, String sport, double size, int qty, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, brand, model, sport, size, qty, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    //should take an int and return an object with that id, if exists
    public Sneaker findSneaker(int id) {
        for (Sneaker sneaker : inventory) {
            if (sneaker.getId() == id) return sneaker;
        }
        return null;
    }

    //should return a basic array copy of the ArrayList
    public Sneaker[] findAll() {
        Sneaker[] result = new Sneaker[inventory.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = inventory.get(i);
        }
        return result;
    }

    //should remove the object with this id from the ArrayList if it exists and return true
    //otherwise return false
    public boolean delete(int id) {
        if (findSneaker(id) != null) {
            inventory.remove(findSneaker(id));
            return true;
        } else return false;
    }
}
