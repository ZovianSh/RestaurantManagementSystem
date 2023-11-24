package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Beverage {
        private static int nextId = 1;
        private String id;
        private String name;
        private double price;
        private Beverage beverage;
        private boolean alcoholic;

        public Beverage(String name, double price, boolean alcoholic) {
            this.id = String.format("D%03d", nextId++);
            this.name = name;
            this.price = price;
            this.alcoholic = alcoholic;
        }
}
