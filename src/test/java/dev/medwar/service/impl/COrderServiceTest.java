package dev.medwar.service.impl;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class COrderServiceTest {

  private COrderService underTest = new COrderService();

  @Test
  @DisplayName("Scenario for getId method")
  void testGetId() {
    Long actual = underTest.getId();

    assertNull(actual);
  }

}