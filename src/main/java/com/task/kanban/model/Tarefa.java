package com.task.kanban.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Tarefa")
@Table(name = "tarefas")
public class Tarefa {
    public Tarefa(int id, String titulo, String descricao, LocalDateTime dataCriacao, String status, String prioridade, LocalDateTime dataLimite) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.status = status;
        this.prioridade = prioridade;
        this.dataLimite = dataLimite;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;
    private String status;
    private String prioridade;
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

    public String getStatus() {
        return status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }
}
