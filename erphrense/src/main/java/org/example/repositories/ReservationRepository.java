package org.example.repositories;

import org.example.domain.Reservation;
import org.example.domain.VehiculeCategory;

import java.util.ArrayList;
import java.util.List;

public interface ReservationRepository {


    public void add(Reservation reservation);

    public void delete(int reference);

    public List<Reservation> findByCategory(VehiculeCategory vehiculeCategory);

    public Reservation findByReference(int reference);
    public Reservation update(Reservation reservation);

}
