package com.a;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
public class User {
    String name;
    Integer age;
}
