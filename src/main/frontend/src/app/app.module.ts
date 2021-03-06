import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TaskComponent } from './task/task.component';
import { TaskAddComponent } from './task/task-add/task-add.component';
import { TaskListComponent } from './task/task-list/task-list.component';

@NgModule({
  declarations: [
    AppComponent,
    TaskComponent,
    TaskAddComponent,
    TaskListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
