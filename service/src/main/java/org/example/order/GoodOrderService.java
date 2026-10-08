package org.example.order;

import java.math.BigDecimal;

public class GoodOrderService {

    public BigDecimal calculateOrderTotal(Order order) {
        BigDecimal total = BigDecimal.ZERO;
        for (OrderItem item: order.items()) {
            BigDecimal itemTotal = item.price().multiply(BigDecimal.valueOf(item.quantity()));
            total = total.add(itemTotal);
        }
        return total;
    }

    public BigDecimal calculateRefundAmount(Order order) {
        return calculateOrderTotal(order).multiply(new BigDecimal("0.90"));
    }
}
