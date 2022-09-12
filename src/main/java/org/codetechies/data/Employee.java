package org.codetechies.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Builder
public class Employee {

    private String name;
    private int skillLevel;
    private double rating;
    private String gender;
    private List<Projects> projects;
    private List<String> skills;
    private Optional<Car> car;

}
