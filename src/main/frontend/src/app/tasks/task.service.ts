import {Http, Response} from "@angular/http";
import "rxjs/Rx";
import {Task} from "./task.model";
import {EventEmitter, Injectable} from "@angular/core";

@Injectable()
export class TaskService{
    constructor(private http:Http){
    }
    getTasks(){
        return this.http.get('/api/tasks').map(response=>response.json());
    }

    saveTask(task:Task,checked:boolean){
        task.completed = checked;
        return this.http.post('/api/tasks/save',task)
        .map(response=>response.json());
    }
}