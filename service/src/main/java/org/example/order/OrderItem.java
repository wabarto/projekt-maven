package org.example.order;

import java.math.BigDecimal;

public record OrderItem(String name, BigDecimal price, int quantity, BigDecimal discount) {
}
