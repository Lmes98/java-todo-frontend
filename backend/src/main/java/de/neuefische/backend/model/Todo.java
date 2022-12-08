package de.neuefische.backend.model;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Todo {
    private int id;
    private String description;
    private String status;

}
