package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private String city;

    private String street;

    private String zipcode;

    private DeliveryStatus deliveryStatus;
}
