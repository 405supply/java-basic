package assignment;

import assignment.reqClass.Order;

import java.util.*;
import java.util.stream.Collectors;

public class Chap16Stream2 {
    private static final List<Order> orders = Arrays.asList(
            new Order("O001", "홍길동", Arrays.asList("노트북", "마우스"), 1200.0, "배송 완료"),
            new Order("O002", "김철수", Arrays.asList("스마트폰"), 800.0, "배송 중"),
            new Order("O003", "이영희", Arrays.asList("태블릿", "키보드"), 600.0, "배송 완료"),
            new Order("O004", "박민수", Arrays.asList("모니터"), 300.0, "배송 중")
    );

    public void deliveredOrderId() {
        List<String> completedOrderIds = orders.stream()
                .filter(order -> Objects.equals(order.getStatus(), "배송 완료"))
                .map(Order::getOrderId)
                .toList();

        System.out.println(completedOrderIds);
    }

    public void totalAmountByCustomer() {
        Map<String, Double> totalAmountByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.summingDouble(Order::getTotalAmount)
                ));
        System.out.println(totalAmountByCustomer);
    }

    public void highestOrderCustomer() {
        String highestOrderCustomer = orders.stream()
                .max(Comparator.comparing(Order::getTotalAmount))
                .map(Order::getCustomerName)
                .toString();

        System.out.println(highestOrderCustomer);
    }
}
