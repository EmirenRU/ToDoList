package com.emiren.todolist.DTO;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class TaskDTO {
    private Long id;

    @NotEmpty
    private String title;
    @NotEmpty
    private String description;

    @NotEmpty
    private LocalDate deadline;
    @NotEmpty
    private boolean completed;

}
