package com.task.kanban.repository;

import com.task.kanban.model.Tarefa;
import com.task.kanban.model.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
    List<Tarefa> findByStatus(Status status);
}