package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;

public class SneakerServiceTest {
    @Test
    public void createTest() {
        //Given
        String expectedBrand = "Nike";
        String expectedModel = "Dunk";
        String expectedSport = "skateboarding";
        double expectedSize = 11.5;
        int expectedQty = 200;
        float expectedPrice = 110;

        //When
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedBrand,expectedModel,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        int actualId = testSneaker.getId();
        String actualBrand = testSneaker.getBrand();
        String actualModel = testSneaker.getModel();
        String actualSport = testSneaker.getSport();
        double actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        //Then
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedModel, actualModel);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
    @Test
    public void findSneakerTest() {
        //Given
        String expectedBrand = "Nike";
        String expectedModel = "Dunk";
        String expectedSport = "skateboarding";
        double expectedSize = 11.5;
        int expectedQty = 200;
        float expectedPrice = 110;
        String expectedBrand2 = "Nike";
        String expectedModel2 = "Vapormax";
        String expectedSport2 = "lifestyle";
        double expectedSize2 = 11.5;
        int expectedQty2 = 100;
        float expectedPrice2 = 210;
        //When
        SneakerService sneakerService = new SneakerService();
        Sneaker expectedSneaker = sneakerService.create(expectedBrand,expectedModel,
                expectedSport, expectedSize, expectedQty, expectedPrice);
        Sneaker expectedSneaker2 = sneakerService.create(expectedBrand2,expectedModel2,
                expectedSport2, expectedSize2, expectedQty2, expectedPrice2);
        Sneaker actualSneaker = sneakerService.findSneaker(expectedSneaker.getId());
        Sneaker actualSneaker2 = sneakerService.findSneaker(expectedSneaker2.getId());
        //Then
        Assertions.assertEquals(expectedSneaker, actualSneaker);
        Assertions.assertEquals(expectedSneaker2, actualSneaker2);
    }
    @Test
    public void findAllTest() {
        //Given
        String expectedBrand = "Nike";
        String expectedModel = "Dunk";
        String expectedSport = "skateboarding";
        double expectedSize = 11.5;
        int expectedQty = 200;
        float expectedPrice = 110;
        String expectedBrand2 = "Nike";
        String expectedModel2 = "Vapormax";
        String expectedSport2 = "lifestyle";
        double expectedSize2 = 11.5;
        int expectedQty2 = 100;
        float expectedPrice2 = 210;
        //When
        SneakerService sneakerService = new SneakerService();
        Sneaker expectedSneaker = sneakerService.create(expectedBrand,expectedModel,
                expectedSport, expectedSize, expectedQty, expectedPrice);
        Sneaker expectedSneaker2 = sneakerService.create(expectedBrand2,expectedModel2,
                expectedSport2, expectedSize2, expectedQty2, expectedPrice2);
        Sneaker[] expected = {expectedSneaker, expectedSneaker2};
        Sneaker[] actual = sneakerService.findAll();
        //Then
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void deleteTest2() {
        //Given
        String expectedBrand = "Nike";
        String expectedModel = "Dunk";
        String expectedSport = "skateboarding";
        double expectedSize = 11.5;
        int expectedQty = 200;
        float expectedPrice = 110;
        String expectedBrand2 = "Nike";
        String expectedModel2 = "Vapormax";
        String expectedSport2 = "lifestyle";
        double expectedSize2 = 11.5;
        int expectedQty2 = 100;
        float expectedPrice2 = 210;
        //When
        SneakerService sneakerService = new SneakerService();
        Sneaker expectedSneaker = sneakerService.create(expectedBrand,expectedModel,
                expectedSport, expectedSize, expectedQty, expectedPrice);
        Sneaker expectedSneaker2 = sneakerService.create(expectedBrand2,expectedModel2,
                expectedSport2, expectedSize2, expectedQty2, expectedPrice2);

        //Then
        Assertions.assertTrue(sneakerService.delete(1));
    }
}
