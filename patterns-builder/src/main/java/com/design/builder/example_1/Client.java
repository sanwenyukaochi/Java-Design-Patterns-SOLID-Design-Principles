package com.design.builder.example_1;

public class Client {

    static void main() {
        User user = new User.Builder()
                .firstName(null)
                .lastName(null)
                .birthday(null)
                .address(new Address.Builder()
                        .houseNumber(null)
                        .street(null)
                        .city(null)
                        .zipcode(null)
                        .state(null)
                        .build())
                .build();
    }

}
