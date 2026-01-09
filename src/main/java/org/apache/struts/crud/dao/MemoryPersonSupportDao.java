package org.apache.struts.crud.dao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bruce phillips
 * @author antonio sanchez
 */
public class MemoryPersonSupportDao implements PersonSupportDao {
    private static final String[] countries;
    private static final String[] genders = {"male", "female"};
    private static final String[] sports = {"football", "baseball", "basketball", "mtb" };
    private static final String [] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan", "Seat"};

    static {
        countries = new String[] {"Spain", "Ireland", "Italy", "Poland", "Usa"};
    }



    @Override
    public String[] getCarModels() {
        return carModelsAvailable;
    }

    @Override
    public String[] getSports() {
        return sports;
    }

    @Override
    public String[] getGenders() {
        return genders;
    }

    @Override
    public String[] getCountries() {
        return countries;
    }
}
