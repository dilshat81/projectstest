package org.example.controllers;

import mocks.MockReservationService;
import mocks.MockVehiculeService;
import org.example.domain.Reservation;
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



public class ReservationControllerTest {

    private static ReservationController reservationController;
    private static VehiculeService vehiculeService;

    @BeforeClass
    public static void setUpClass() {
        ReservationService reservationService = new MockReservationService();
        VehiculeService vehiculeService = new MockVehiculeService();
        // TODO: A modifier pour le second argument
        reservationController = new ReservationController(reservationService, vehiculeService);
    }

    @Test
    public void testBook() {
       VehiculeCategory category = new VehiculeCategory("Jet");
        VehiculeSubCategory subCategory = new VehiculeSubCategory(category, "Eco");
        ReservationRequest request = new ReservationRequest(category, subCategory, "Annie Versaire", "Paris", "New York", "2023-01-23", "2023-02-15");
        String result = reservationController.book(0, 0, "Annie Versaire", "Paris", "New York", "2023-01-23", "2023-02-15");
        Assert.assertEquals("99999 = Jet, Eco", result);

    }

  @Test
    public void cancel(){
         reservationController.cancel(9999);
    }
  @Test
    public void testlist() {
      List<String> results = new ArrayList<>();
      MockReservationService mockReservationService = new MockReservationService();
      results = reservationController.list(1);

      Assert.assertEquals((mockReservationService.list(new VehiculeCategory("Jet"))).toString(), results.toString());
  }

  @Test
   public void testFindByReference() {

     String Actual = reservationController.findByReference(9999);
     String Expect = "R9999, client: Annie Versaire, Jet, Eco, debut: 2023-01-23, fin: 2023-02-15";
     Assert.assertEquals(Expect,Actual);
    }

   @Test
    public void testChangeReservationClient(){
       Boolean result =  reservationController.changeReservationClient(9999,"Annie");
       Boolean Expect = true;
       Assert.assertEquals(Expect,result);


   }

  }





