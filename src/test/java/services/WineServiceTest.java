package services;

import models.Wine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WineServiceTest {
    @Test
    public void createTest() {
        //Given
        String name1 = "Francis Coppola";
        String type1 = "Pinot Noir";
        int year1 = 2019;
        int qty1 = 15;
        float price1 = 18;
        String name2 = "La Posta";
        String type2 = "Malbec";
        int year2 = 2020;
        int qty2 = 20;
        float price2 = 20;
        //When
        WineService wineService1 = new WineService();
        Wine testWine = wineService1.create(name1, type1, year1, qty1, price1);
        Wine testWine2 = wineService1.create(name2, type2, year2, qty2, price2);
        int actualId1 = testWine.getId();
        int actualId2 = testWine.getId();
        String actualName = testWine.getName();
        String actualType = testWine.getType();
        int actualYear = testWine.getYear();
        int actualQty = testWine.getQty();
        float actualPrice = testWine.getPrice();
        //Then
        Assertions.assertEquals(name1, actualName);
        Assertions.assertEquals(type1, actualType);
        Assertions.assertEquals(year1, actualYear);
        Assertions.assertEquals(qty1, actualQty);
        Assertions.assertEquals(price1, actualPrice);
//        Assertions.assertEquals(1, actualId1);
//        Assertions.assertEquals(2, actualId2);
    }
    @Test
    public void findWineTest() {
        //Given
        String name1 = "Francis Coppola";
        String type1 = "Pinot Noir";
        int year1 = 2019;
        int qty1 = 15;
        float price1 = 18;
        String name2 = "La Posta";
        String type2 = "Malbec";
        int year2 = 2020;
        int qty2 = 20;
        float price2 = 20;
        //When
        WineService wineService = new WineService();
        Wine testWine1 = wineService.create(name1, type1, year1, qty1, price1);
        Wine testWine2 = wineService.create(name2, type2, year2, qty2, price2);
        Wine actualWine1 = wineService.findWine(testWine1.getId());
        Wine actualWine2 = wineService.findWine(testWine2.getId());
        //Then
        Assertions.assertEquals(testWine1, actualWine1);
        Assertions.assertEquals(testWine2, actualWine2);
        System.out.println(actualWine1.toString());
    }
    @Test
    public void findAllTest() {
        //Given
        String name1 = "Francis Coppola";
        String type1 = "Pinot Noir";
        int year1 = 2019;
        int qty1 = 15;
        float price1 = 18;
        String name2 = "La Posta";
        String type2 = "Malbec";
        int year2 = 2020;
        int qty2 = 20;
        float price2 = 20;
        //When
        WineService wineService = new WineService();
        Wine testWine1 = wineService.create(name1, type1, year1, qty1, price1);
        Wine testWine2 = wineService.create(name2, type2, year2, qty2, price2);
        Wine[] expected = {testWine1, testWine2};
        Wine[] actual = wineService.findAll();
        //Then
        Assertions.assertArrayEquals(expected, actual);
        System.out.println(wineService.formattedString(actual));
    }
    @Test
    public void deleteTest() {
        //Given
        String name1 = "Francis Coppola";
        String type1 = "Pinot Noir";
        int year1 = 2019;
        int qty1 = 15;
        float price1 = 18;
        String name2 = "La Posta";
        String type2 = "Malbec";
        int year2 = 2020;
        int qty2 = 20;
        float price2 = 20;
        //When
        WineService wineService = new WineService();
        Wine testWine1 = wineService.create(name1, type1, year1, qty1, price1);
        Wine testWine2 = wineService.create(name2, type2, year2, qty2, price2);
        //Then
        Assertions.assertTrue(wineService.delete(1));
    }
}
