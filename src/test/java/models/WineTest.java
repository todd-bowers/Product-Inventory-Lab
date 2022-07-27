package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WineTest {

    @Test
    public void setIdTest() {
        //Given
        int expected = 2;
        //When
        Wine testBottle = new Wine();
        testBottle.setId(expected);
        //Then
        Assertions.assertEquals(expected, testBottle.getId());
    }
    @Test
    public void setNameTest() {
        //Given
        String expected = "Francis Coppola";
        //When
        Wine testBottle = new Wine();
        testBottle.setName(expected);
        //Then
        Assertions.assertEquals(expected, testBottle.getName());
    }
    @Test
    public void setTypeTest() {
        //Given
        String expected = "Pinot Noir";
        //When
        Wine testBottle = new Wine();
        testBottle.setType(expected);
        //Then
        Assertions.assertEquals(expected, testBottle.getType());
    }
    @Test
    public void setYearTest() {
        //Given
        int expected = 2019;
        //When
        Wine testBottle = new Wine();
        testBottle.setYear(expected);
        //Then
        Assertions.assertEquals(expected, testBottle.getYear());
    }
    @Test
    public void setQtyTest() {
        //Given
        int expected = 15;
        //When
        Wine testBottle = new Wine();
        testBottle.setQty(expected);
        //Then
        Assertions.assertEquals(expected, testBottle.getQty());
    }
    @Test
    public void setPriceTest() {
        //Given
        float expected = 18;
        //When
        Wine testBottle = new Wine();
        testBottle.setPrice(expected);
        //Then
        Assertions.assertEquals(expected, testBottle.getPrice());
    }
    @Test
    public void constructorTest() {
        //Given
        int expectedID = 6;
        String expectedName = "La Posta";
        String expectedType = "Malbec";
        int expectedYear = 2020;
        int expectedQty = 20;
        float expectedPrice = 20;
        //When
        Wine testBottle = new Wine(expectedID, expectedName, expectedType,
                expectedYear, expectedQty, expectedPrice);
        //Then
        Assertions.assertEquals(expectedID, testBottle.getId());
        Assertions.assertEquals(expectedName, testBottle.getName());
        Assertions.assertEquals(expectedType, testBottle.getType());
        Assertions.assertEquals(expectedYear, testBottle.getYear());
        Assertions.assertEquals(expectedQty, testBottle.getQty());
        Assertions.assertEquals(expectedPrice, testBottle.getPrice());
    }
}
