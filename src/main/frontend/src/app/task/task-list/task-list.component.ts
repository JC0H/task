import {Component, OnInit} from '@angular/core';
import {Task} from '../task.model';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {

  task: Task[] = [];

  constructor() { }

  ngOnInit() {
      this.task.push( new Task(1,"Andriy", "white", "M"))
  }

}
