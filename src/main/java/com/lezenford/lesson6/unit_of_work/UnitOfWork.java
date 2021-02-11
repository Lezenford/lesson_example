package com.lezenford.lesson6.unit_of_work;

import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {
    private static final ThreadLocal<UnitOfWork> local = new ThreadLocal<>();

    private List<DomainObject> newObjects = new ArrayList<>();
    private List<DomainObject> updateObjects = new ArrayList<>();
    private List<DomainObject> removeObjects = new ArrayList<>();

    public static void newCurrent() {
        local.set(new UnitOfWork());
    }

    public static void setCurrent(UnitOfWork unitOfWork) {
        local.set(unitOfWork);
    }

    public static UnitOfWork getCurrent() {
        return local.get();
    }

    public void registerNew(DomainObject object) {
        newObjects.add(object);
    }

    public void registerDirty(DomainObject object) {
        updateObjects.add(object);
    }

    public void registerRemoved(DomainObject obj) {
        removeObjects.add(obj);
    }

    public void registerClean() {
        newObjects.clear();
        updateObjects.clear();
        removeObjects.clear();
    }

    public void commit() {
        insertNew();
        updateDirty();
        deleteRemoved();
    }

    private void insertNew() {
        for (DomainObject object : newObjects) {
            //convert objects for DB objects and save
        }
    }

    private void updateDirty() {
        for (DomainObject object : updateObjects) {
            //convert objects for DB objects and update
        }
    }

    private void deleteRemoved() {
        for (DomainObject object : removeObjects) {
            //remove objects from DB
        }
    }

}
