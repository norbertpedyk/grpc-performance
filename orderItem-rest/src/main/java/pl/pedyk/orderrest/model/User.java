package pl.pedyk.orderrest.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private String surname;
    private String email;
}
