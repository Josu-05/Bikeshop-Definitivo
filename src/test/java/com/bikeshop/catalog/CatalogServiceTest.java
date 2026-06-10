package com.bikeshop.catalog;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatalogServiceTest {

    @Test
    void shouldFindBikeById() {
        CatalogService catalog = new CatalogService();
        Bike bike = catalog.findById("bike123");
        assertEquals("bike123", bike.getId());
    }
}
