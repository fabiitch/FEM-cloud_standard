package com.fem;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.Key;
import org.junit.Test;

import java.io.IOException;

public class DataStoreTest {

    @Test
    public void testLocal() throws IOException, InterruptedException {
        Datastore ds = DatastoreOptions.newBuilder().setHost("http://localhost:8081").setProjectId("testfem-9158a").build().getService();
        Key key = ds.newKeyFactory().setNamespace("testNamespace").setKind("MyEntity").newKey("mykey");
        Entity entity= Entity.newBuilder(key).set("p1", "Hello World!").build();
        entity = ds.put(entity);
        entity = ds.get(key);
        System.out.println(entity);
    }
}
