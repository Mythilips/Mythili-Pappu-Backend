package org.Week1.Abstraction;

public class ITDepartment extends Department {
    private int departmentSize;

    public ITDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }
}