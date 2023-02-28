package org.example.repositories;

import org.example.domain.VehiculeCategory;

import java.util.List;

public interface VehiculeCategoryRepository {
    public List<VehiculeCategory> provide();

    public VehiculeCategory find(int index);

    public VehiculeCategory create(String name);
}
