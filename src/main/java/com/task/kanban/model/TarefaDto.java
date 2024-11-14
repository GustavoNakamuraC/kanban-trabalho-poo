package com.task.kanban.model;

import com.task.kanban.model.enums.Prioridade;
import com.task.kanban.model.enums.Status;

import java.time.LocalDateTime;

public class TarefaDto {
    public TarefaDto(int id, String titulo, String descricao, LocalDateTime dataCriacao, Status status, Prioridade prioridade, LocalDateTime dataLimite) {
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
    private LocalDateTime dataCriacao;
    private Status status;
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
