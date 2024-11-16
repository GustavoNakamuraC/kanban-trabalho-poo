package com.task.kanban.model;

import com.task.kanban.model.enums.Prioridade;
import com.task.kanban.model.enums.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TarefaDto {
    public TarefaDto(int id, String titulo, String descricao, LocalDate dataCriacao, Status status, Prioridade prioridade, LocalDate dataLimite) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.status = status;
        this.prioridade = prioridade;
        this.dataLimite = dataLimite;
    }

    private int id;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private Status status;
    private Prioridade prioridade;
    private LocalDate dataLimite;

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public Status getStatus() {
        return status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }
}
