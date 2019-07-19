package com.code.models;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ToString
public class Location {
    private String name;
    private String pinCode;

}
