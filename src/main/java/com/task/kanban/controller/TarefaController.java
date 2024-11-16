package com.task.kanban.controller;

import com.task.kanban.mapper.TarefaMapper;
import com.task.kanban.model.TarefaDto;
import com.task.kanban.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasks")
public class TarefaController {
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    private final TarefaService tarefaService;

    //Criar novas tarefas na coluna "A Fazer".
    @PostMapping()
    public TarefaDto criarTarefa(@RequestBody TarefaDto tarefaDto){
        return tarefaService.criarTarefa(TarefaMapper.dtoToEntity(tarefaDto));
    }

    //Listar todas as tarefas organizadas por coluna (A Fazer, Em Progresso, Concluído).
    @GetMapping()
    public List<TarefaDto> listarTarefas(){
        return tarefaService.listarTarefas();
    }

    //Mover uma tarefa entre as colunas do Kanban (A Fazer → Em Progresso → Concluído).
    @PutMapping(value = "/{id}/move")
    public TarefaDto moverTarefa(@PathVariable("id") Integer id){
        return tarefaService.moverTarefa(id);
    }

    //Editar uma tarefa (alterar título, descrição, prioridade, etc.).
    @PutMapping(value = "/{id}")
    public TarefaDto editarTarefa(@RequestBody TarefaDto tarefaEditada, @PathVariable("id") Integer id){
        return tarefaService.alterarTarefa(tarefaEditada, id    );
    }
}
