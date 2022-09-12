package org.codetechies.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Projects {
    private String name;
    private String clientName;
}
