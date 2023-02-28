package mocks;

import org.example.domain.VehiculeCategory;
import org.example.domain.VehiculeSubCategory;
import org.example.services.VehiculeService;

import java.util.ArrayList;
import java.util.List;

public class MockVehiculeService implements VehiculeService {
    @Override
    public List<VehiculeCategory> listCategory() {

        List<VehiculeCategory> listVehicule = new ArrayList<>();
        listVehicule.add(0,new VehiculeCategory("turbo"));

        return listVehicule;

    }

    @Override
    public List<VehiculeSubCategory> listSubCategory(VehiculeCategory vehiculeCategory) {

        List<VehiculeSubCategory> listVehiculeSubCategory = new ArrayList<>();

        return listVehiculeSubCategory;
    }

    @Override
    public VehiculeCategory findCategory(int index) {

        return new VehiculeCategory("Jet");
    }

    @Override
    public VehiculeSubCategory findSubCateogry(VehiculeCategory vehiculeCategory, int index) {
        return new VehiculeSubCategory(new VehiculeCategory("Jet"),"Eco");
    }

    @Override
    public VehiculeCategory createCategory(String name) {
        return new VehiculeCategory("Jet");
    }

    @Override
    public VehiculeSubCategory createSubCategory(VehiculeCategory category, String name) {
        return null;
    }
}
