package com.ammous.kafka.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Rami Ammous
 */
@Getter
@Setter
@ToString
public class Student {

    private int id;
    private String firstName;
    private String lastName;
}
