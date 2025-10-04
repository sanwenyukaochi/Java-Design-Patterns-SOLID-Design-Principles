package com.design.builder.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String zipcode;
    private String state;

    public static class Builder {
        private String houseNumber;
        private String street;
        private String city;
        private String zipcode;
        private String state;

        public Builder houseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder zipcode(String zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        // 最终构建方法
        public Address build() {
            return new Address(houseNumber, street, city, zipcode, state);
        }
    }
}
