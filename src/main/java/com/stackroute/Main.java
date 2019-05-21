package com.stackroute;

import com.stackroute.db.CrudOperation;
import com.stackroute.db.DatabaseMetadataDemo;
import com.stackroute.db.ResultsetMetadataDemo;

public class Main {
    public static void main(String[] args) {
        CrudOperation crudOperation = new CrudOperation();
        crudOperation.displayData();
        crudOperation.displayCustomrerByName("riya","F");

        System.out.println("Resultset MetaData created");
        ResultsetMetadataDemo resultsetMetadataDemo=new ResultsetMetadataDemo();
        resultsetMetadataDemo.resultsetMetadataMethod();

        System.out.println("Database MetaData created");
        DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
        databaseMetadataDemo.databaseMetadataMethod();
    }
}
