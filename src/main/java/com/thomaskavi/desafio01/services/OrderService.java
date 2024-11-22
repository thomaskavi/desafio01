package com.thomaskavi.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomaskavi.desafio01.entities.Order;

@Service
public class OrderService {

  @Autowired
  private ShippingService shippingService;

  public Double total(Order order) {
    double discount = order.getBasic() * (order.getDiscount() / 100);
    double total = order.getBasic() - discount + shippingService.shipment(order);
    return total;
  }
}