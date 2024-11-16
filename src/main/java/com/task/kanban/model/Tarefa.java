package com.task.kanban.model;

import com.task.kanban.model.enums.Prioridade;
import com.task.kanban.model.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "Tarefa")
@Table(name = "tarefas")
public class Tarefa {
    public Tarefa(int id, String titulo, String descricao, Prioridade prioridade, LocalDate dataLimite) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.status = Status.A_FAZER;
        this.prioridade = prioridade;
        this.dataLimite = dataLimite;
    }

    public Tarefa(){ }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
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

    public void setStatus(Status status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", status=" + status +
                ", prioridade=" + prioridade +
                ", dataLimite=" + dataLimite +
                '}';
    }
}
