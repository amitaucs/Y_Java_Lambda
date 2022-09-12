package org.codetechies.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Car {

    private String model;
    private String made;
    private String color;
}
