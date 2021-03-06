package com.crud.tasks.repository;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unchecked")
@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    @Override
    List<Task> findAll();

    @Override
    Task save(Task task);

    Optional<Task> findById(Long id);

    void deleteById(Long id);

    @Override
    long count ();
}