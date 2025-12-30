package com.design.builder.example_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

    public static class Builder {
        private String firstName;
        private String lastName;
        private LocalDate birthday;
        private Address address;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(firstName, lastName, birthday, address);
        }
    }
}