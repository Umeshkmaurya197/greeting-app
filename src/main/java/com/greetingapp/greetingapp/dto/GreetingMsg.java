package com.greetingapp.greetingapp.dto;

public class GreetingMsg {
        private String firstName;
        private String lastName;
        private String message;


        public GreetingMsg(String firstName, String lastName, String message) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.message = message;
        }

        public String getMessage() {
                return message;
        }

        public void setMessage(String message) {
                this.message = message;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
}
