package com.task.kanban.service;

import com.task.kanban.mapper.TarefaMapper;
import com.task.kanban.model.Tarefa;
import com.task.kanban.model.TarefaDto;
import com.task.kanban.model.enums.Status;
import com.task.kanban.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    private final TarefaRepository tarefaRepository;

    public TarefaDto criarTarefa(Tarefa tarefa){
        return TarefaMapper.entityToDto(tarefaRepository.save(tarefa));
    }

    public List<TarefaDto> listarTarefas(){
        List<TarefaDto> tarefaList = new ArrayList<>();

        List<Tarefa> resultadoAFazer = tarefaRepository.findByStatus(Status.A_FAZER);
        if (!resultadoAFazer.isEmpty()) {
            resultadoAFazer.forEach(tarefa -> tarefaList.add(TarefaMapper.entityToDto(tarefa)));
        }

        List<Tarefa> resultadoEmProgresso = tarefaRepository.findByStatus(Status.EM_PROGRESSO);
        if (!resultadoEmProgresso.isEmpty()){
            resultadoEmProgresso.forEach(tarefa -> tarefaList.add(TarefaMapper.entityToDto(tarefa)));
        }

        List<Tarefa> resultadoConcluido = tarefaRepository.findByStatus(Status.CONCLUIDO);
        if (!resultadoConcluido.isEmpty()){
            resultadoConcluido.forEach(tarefa -> tarefaList.add(TarefaMapper.entityToDto(tarefa)));
        }

        return tarefaList;
    }
}
