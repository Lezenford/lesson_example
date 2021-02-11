package com.lezenford.lesson6.unit_of_work;

public class DomainObject {
    protected void markNew() {
        UnitOfWork.getCurrent().registerNew(this);
    }

    protected void markClean() {
        UnitOfWork.getCurrent().registerClean();
    }

    protected void markDirty() {
        UnitOfWork.getCurrent().registerDirty(this);
    }

    protected void markRemoved() {
        UnitOfWork.getCurrent().registerRemoved(this);
    }
}
