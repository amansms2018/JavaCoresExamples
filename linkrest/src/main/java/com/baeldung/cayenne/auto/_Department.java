package com.baeldung.cayenne.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.baeldung.cayenne.Employee;

/**
 * Class _Department was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Department extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String DEP_ID_PK_COLUMN = "dep_id";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<Employee>> EMPLOYEES = Property.create("employees", List.class);

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToEmployees(Employee obj) {
        addToManyTarget("employees", obj, true);
    }
    public void removeFromEmployees(Employee obj) {
        removeToManyTarget("employees", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Employee> getEmployees() {
        return (List<Employee>)readProperty("employees");
    }


}
