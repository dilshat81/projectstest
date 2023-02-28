package org.example.services;

import org.example.domain.VehiculeCategory;
import org.example.domain.VehiculeSubCategory;

import java.util.List;

public interface VehiculeService {
    List<VehiculeCategory> listCategory();
    List<VehiculeSubCategory> listSubCategory(VehiculeCategory vehiculeCategory);
    VehiculeCategory findCategory(int index);
    VehiculeSubCategory findSubCateogry(VehiculeCategory vehiculeCategory, int index);
    VehiculeCategory createCategory(String name);
    VehiculeSubCategory createSubCategory(VehiculeCategory category, String name);


}
