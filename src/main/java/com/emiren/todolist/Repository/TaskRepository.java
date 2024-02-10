package com.emiren.todolist.Repository;

import com.emiren.todolist.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Optional<Task> findByTitle(String title);

    @Query("SELECT t FROM Task t WHERE t.title LIKE CONCAT('%', :query, '%') ")
    List<Task> searchTasksByName(String query);

    @Query("SELECT t FROM Task t WHERE t.deadline = :query")
    List<Task> searchTasksByDeadline(LocalDate query);

}
