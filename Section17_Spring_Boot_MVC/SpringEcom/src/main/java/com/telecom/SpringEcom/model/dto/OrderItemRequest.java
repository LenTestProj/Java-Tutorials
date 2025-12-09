package com.telecom.SpringEcom.model.dto;

public record OrderItemRequest(
    int productId,
    int quantity
) {}
