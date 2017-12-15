import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { Task } from '../task.model';

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  tasks:Task[] = [];
  //{id:number, name:string, completed:boolean}


  constructor(private taskService:TaskService) { }

  ngOnInit() {
   return this.taskService.getTasks()
   .subscribe(
     (tasks:any[])=>{
       this.tasks = tasks
     },
     (error)=>console.log(error)
    );
  }

  getDueDateLabel(task: Task){
    return task.completed ? 'label-success' : 'label-primary';
  }

  onTaskChange(event, task) {
     this.taskService.saveTask(task,event.target.checked).subscribe();
    }

}
