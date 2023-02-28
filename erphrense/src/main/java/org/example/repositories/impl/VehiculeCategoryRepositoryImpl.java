package org.example.repositories.impl;

import org.example.domain.VehiculeCategory;
import org.example.repositories.VehiculeCategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class VehiculeCategoryRepositoryImpl implements VehiculeCategoryRepository {

    private List<VehiculeCategory> data;

    public VehiculeCategoryRepositoryImpl() {
        this.data = new ArrayList<>();
        data.add(new VehiculeCategory("Jet"));
        data.add(new VehiculeCategory("Voiture"));
        data.add(new VehiculeCategory("Bateau"));
    }

    @Override
    public List<VehiculeCategory> provide() {
        return data;
    }
    @Override
    public VehiculeCategory find(int index) {
        return data.get(index);
    }

    @Override
    public VehiculeCategory create(String name) {
        VehiculeCategory category = new VehiculeCategory(name);
        data.add(category);
        return category;
    }

}

