package io.kanban.projectboard.service;

import io.kanban.projectboard.domain.ProjectTask;
import io.kanban.projectboard.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;


    public ProjectTask saveORupdateProjectTask(ProjectTask projectTask){
        return projectTaskRepository.save(projectTask);
    }

    public ProjectTask findById(Long id){
        return projectTaskRepository.getById(id);
    }

    public Iterable<ProjectTask> findAll(){
        return projectTaskRepository.findAll();
    }

    public void delete(Long id){
        ProjectTask projectTask = projectTaskRepository.getById(id);

        projectTaskRepository.delete(projectTask);
    }
}
