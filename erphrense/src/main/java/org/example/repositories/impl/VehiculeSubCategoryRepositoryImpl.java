package org.example.repositories.impl;

import org.example.domain.VehiculeCategory;
import org.example.domain.VehiculeSubCategory;
import org.example.repositories.VehiculeSubCategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class VehiculeSubCategoryRepositoryImpl implements VehiculeSubCategoryRepository {

    // Jet : Eco, Confort, Hypersonic
    // Voiture : Turbo, Circuit
    private List<VehiculeSubCategory> data;

    public VehiculeSubCategoryRepositoryImpl() {
        this.data = new ArrayList<>();
        VehiculeCategory jet = new VehiculeCategory("Jet");
        data.add(new VehiculeSubCategory(jet, "Eco"));
        data.add(new VehiculeSubCategory(jet, "Confort"));
        data.add(new VehiculeSubCategory(jet, "Hypersonic"));

        VehiculeCategory voiture = new VehiculeCategory("Voiture");
        data.add(new VehiculeSubCategory(voiture, "Circuit"));
        data.add(new VehiculeSubCategory(voiture, "Turbo"));

        VehiculeCategory bateau = new VehiculeCategory("Bateau");
        data.add(new VehiculeSubCategory(bateau, "Peniche"));
        data.add(new VehiculeSubCategory(bateau, "Croisière"));
    }

    @Override
    public List<VehiculeSubCategory> provide() {
        return data;
    }

    @Override
    public List<VehiculeSubCategory> findBy(VehiculeCategory category) {
        List<VehiculeSubCategory> results = new ArrayList<>();

        for (VehiculeSubCategory s : data) {
            if (s.getCategory().equals(category)) {
                results.add(s);
            }
        }

        return results;
    }

    @Override
    public VehiculeSubCategory find(VehiculeCategory category, int index) {
        return findBy(category).get(index);
    }
    @Override
    public VehiculeSubCategory create(VehiculeCategory category, String name) {
        VehiculeSubCategory subCategory = new VehiculeSubCategory(category, name);
        data.add(subCategory);
        return subCategory;
    }
}

