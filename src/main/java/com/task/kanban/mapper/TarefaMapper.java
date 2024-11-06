package com.task.kanban.mapper;

import com.task.kanban.model.Tarefa;
import com.task.kanban.model.TarefaDto;

public class TarefaMapper {
    public static TarefaDto entityToDto(Tarefa entity){
        return new TarefaDto(
                entity.getId(),
                entity.getTitulo(),
                entity.getDescricao(),
                entity.getDataCriacao(),
                entity.getStatus(),
                entity.getPrioridade(),
                entity.getDataLimite()
        );
    }

    public static Tarefa dtoToEntity(TarefaDto dto){
        return new Tarefa(
                dto.getId(),
                dto.getTitulo(),
                dto.getDescricao(),
                dto.getDataCriacao(),
                dto.getStatus(),
                dto.getPrioridade(),
                dto.getDataLimite()
        );
    }
}
