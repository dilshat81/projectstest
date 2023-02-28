package org.example.repositories;

import org.example.domain.VehiculeCategory;
import org.example.domain.VehiculeSubCategory;

import java.util.ArrayList;
import java.util.List;

public interface VehiculeSubCategoryRepository {
    public List<VehiculeSubCategory> provide();

    public List<VehiculeSubCategory> findBy(VehiculeCategory category);

    public VehiculeSubCategory find(VehiculeCategory category, int index);

    public VehiculeSubCategory create(VehiculeCategory category, String name);

}
