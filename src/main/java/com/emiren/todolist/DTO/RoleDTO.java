package com.emiren.todolist.DTO;


import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDTO {
    private Long id;

    @NotEmpty
    private String name;
}
