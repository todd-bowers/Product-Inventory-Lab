package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    @Test
    public void setBrandTest() {
        //Given
        String expected = "Nike";
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);
        //Then
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }
    @Test
    public void setModelTest() {
        //Given
        String expected = "Vapormax";
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setModel(expected);
        //Then
        Assertions.assertEquals(expected, testSneaker.getModel());
    }
    @Test
    public void setSportTest() {
        //Given
        String expected = "running";
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);
        //Then
        Assertions.assertEquals(expected, testSneaker.getSport());
    }
    @Test
    public void setSizeTest() {
        //Given
        double expected = 11.5;
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);
        //Then
        Assertions.assertEquals(expected, testSneaker.getSize());
    }
    @Test
    public void setQtyTest() {
        //Given
        int expected = 350;
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);
        //Then
        Assertions.assertEquals(expected, testSneaker.getQty());
    }
    @Test
    public void setPriceTest() {
        //Given
        float expected = 210;
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);
        //Then
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }
    @Test
    public void setIdTest() {
        //Given
        int expected = 2;
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setId(expected);
        //Then
        Assertions.assertEquals(expected, testSneaker.getId());
    }
    @Test
    public void constructorTest() {
        //Given
        int expectedID = 6;
        String expectedBrand = "Nike";
        String expectedModel = "Dunk";
        String expectedSport = "skateboarding";
        double expectedSize = 11.5;
        int expectedQty = 200;
        float expectedPrice = 110;
        //When
        Sneaker testSneaker = new Sneaker(expectedID, expectedBrand, expectedModel,
                expectedSport, expectedSize, expectedQty, expectedPrice);
        //Then
        Assertions.assertEquals(expectedID, testSneaker.getId());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedModel, testSneaker.getModel());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedSize, testSneaker.getSize());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }
}
