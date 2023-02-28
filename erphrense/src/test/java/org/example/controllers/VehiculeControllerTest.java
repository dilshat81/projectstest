package org.example.controllers;

import mocks.MockReservationService;
import mocks.MockVehiculeService;
import org.example.domain.ReservationRequest;
import org.example.domain.VehiculeCategory;
import org.example.domain.VehiculeSubCategory;
import org.example.services.ReservationService;
import org.example.services.VehiculeService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class VehiculeControllerTest {
    private static VehiculeController vehiculeController;
    @BeforeClass
    public static void setUpClass() {
        VehiculeService vehiculeService = new MockVehiculeService();

        vehiculeController = new VehiculeController(vehiculeService);
    }

    @Test
    public void testCreateCategory() {
        boolean result = vehiculeController.createCategory("Metro");
        Assert.assertTrue(result);
    }

    @Test
    public void testCreateSubCategory (){
        boolean result = vehiculeController.createSubCategory(0 , "turbo");
        Assert.assertTrue(result);

    }
    @Test
    public void testListVehiculeCategory(){
       List<String> result = vehiculeController.listVehiculeCategories();

       String actual = result.get(0);
       String expect = "turbo";
       Assert.assertEquals(expect,actual);


    }
}
