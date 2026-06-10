package com.bikeshop.catalog;

@Test
void shouldFindBikeById() {
    CatalogService catalog = new CatalogService();
    Bike bike = catalog.findById("bike123");
    assertEquals("bike123", bike.getId());
}
