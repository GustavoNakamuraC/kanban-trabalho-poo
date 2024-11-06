package com.task.kanban.service;

import com.task.kanban.mapper.TarefaMapper;
import com.task.kanban.model.Tarefa;
import com.task.kanban.model.TarefaDto;
import com.task.kanban.repository.TarefaRepository;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    private final TarefaRepository tarefaRepository;

    public TarefaDto criarTarefa(Tarefa tarefa){
        return TarefaMapper.entityToDto(tarefaRepository.save(tarefa));
    }
}
