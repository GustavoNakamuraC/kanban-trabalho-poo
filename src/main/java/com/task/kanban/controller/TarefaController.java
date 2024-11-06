package com.task.kanban.controller;

import com.task.kanban.mapper.TarefaMapper;
import com.task.kanban.model.TarefaDto;
import com.task.kanban.service.TarefaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks")
public class TarefaController {
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    private final TarefaService tarefaService;

    @PostMapping()
    public TarefaDto criarTarefa(@RequestBody TarefaDto tarefaDto){
        return tarefaService.criarTarefa(TarefaMapper.dtoToEntity(tarefaDto));
    }
}
