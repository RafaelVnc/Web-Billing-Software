package com.rafaelvnc.billingsoftware.service;

import com.rafaelvnc.billingsoftware.io.OrderRequest;
import com.rafaelvnc.billingsoftware.io.OrderResponse;


import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
