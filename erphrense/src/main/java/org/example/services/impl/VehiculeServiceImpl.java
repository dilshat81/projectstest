package org.example.services.impl;

import org.example.domain.VehiculeCategory;
import org.example.domain.VehiculeSubCategory;
import org.example.repositories.VehiculeCategoryRepository;
import org.example.repositories.VehiculeSubCategoryRepository;
import org.example.repositories.impl.VehiculeCategoryRepositoryImpl;
import org.example.repositories.impl.VehiculeSubCategoryRepositoryImpl;
import org.example.services.VehiculeService;

import java.util.List;

public class VehiculeServiceImpl implements VehiculeService {
    private final VehiculeCategoryRepository vehiculeCategoryRepository;
    private final VehiculeSubCategoryRepository vehiculeSubCategoryRepository;

    public VehiculeServiceImpl(VehiculeCategoryRepositoryImpl vehiculeCategoryRepository,
                               VehiculeSubCategoryRepositoryImpl vehiculeSubCategoryRepository) {

        this.vehiculeCategoryRepository = vehiculeCategoryRepository;
        this.vehiculeSubCategoryRepository = vehiculeSubCategoryRepository;
    }
    @Override
    public List<VehiculeCategory> listCategory() {
        return vehiculeCategoryRepository.provide();
    }

    @Override
    public List<VehiculeSubCategory> listSubCategory(VehiculeCategory vehiculeCategory) {
        return vehiculeSubCategoryRepository.findBy(vehiculeCategory);
    }

    @Override
    public VehiculeCategory findCategory(int index) {
        return vehiculeCategoryRepository.find(index);
    }

    @Override
    public VehiculeSubCategory findSubCateogry(VehiculeCategory vehiculeCategory, int index) {
        return vehiculeSubCategoryRepository.find(vehiculeCategory, index);
    }

    @Override
    public VehiculeCategory createCategory(String name) {
        return vehiculeCategoryRepository.create(name);
    }

    @Override
    public VehiculeSubCategory createSubCategory(VehiculeCategory category, String name) {
        return vehiculeSubCategoryRepository.create(category, name);
    }

}
