package com.task.kanban.model;

import com.task.kanban.model.enums.Prioridade;
import com.task.kanban.model.enums.Status;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Tarefa")
@Table(name = "tarefas")
public class Tarefa {
    public Tarefa(int id, String titulo, String descricao, Prioridade prioridade, LocalDateTime dataLimite) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDateTime.now();
        this.status = Status.A_FAZER;
        this.prioridade = prioridade;
        this.dataLimite = dataLimite;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;
    private LocalDateTime dataLimite;

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Status getStatus() {
        return status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }
}
