/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.Tasks;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.ProjectServiceProjectTask;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.CommandProperties;

class TasksImpl extends WrapperImpl<TasksInner> implements Tasks {
    private final DataMigrationManager manager;

    TasksImpl(DataMigrationManager manager) {
        super(manager.inner().tasks());
        this.manager = manager;
    }

    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public ProjectServiceProjectTaskImpl define(String name) {
        return wrapModel(name);
    }

    private ProjectServiceProjectTaskImpl wrapModel(ProjectTaskInner inner) {
        return  new ProjectServiceProjectTaskImpl(inner, manager());
    }

    private ProjectServiceProjectTaskImpl wrapModel(String name) {
        return new ProjectServiceProjectTaskImpl(name, this.manager());
    }

    @Override
    public Observable<ProjectServiceProjectTask> cancelAsync(String groupName, String serviceName, String projectName, String taskName) {
        TasksInner client = this.inner();
        return client.cancelAsync(groupName, serviceName, projectName, taskName)
        .map(new Func1<ProjectTaskInner, ProjectServiceProjectTask>() {
            @Override
            public ProjectServiceProjectTask call(ProjectTaskInner inner) {
                return new ProjectServiceProjectTaskImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CommandProperties> commandAsync(String groupName, String serviceName, String projectName, String taskName, CommandPropertiesInner parameters) {
        TasksInner client = this.inner();
        return client.commandAsync(groupName, serviceName, projectName, taskName, parameters)
        .map(new Func1<CommandPropertiesInner, CommandProperties>() {
            @Override
            public CommandProperties call(CommandPropertiesInner inner) {
                return new CommandPropertiesImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProjectServiceProjectTask> listAsync(final String groupName, final String serviceName, final String projectName) {
        TasksInner client = this.inner();
        return client.listAsync(groupName, serviceName, projectName)
        .flatMapIterable(new Func1<Page<ProjectTaskInner>, Iterable<ProjectTaskInner>>() {
            @Override
            public Iterable<ProjectTaskInner> call(Page<ProjectTaskInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProjectTaskInner, ProjectServiceProjectTask>() {
            @Override
            public ProjectServiceProjectTask call(ProjectTaskInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ProjectServiceProjectTask> getAsync(String groupName, String serviceName, String projectName, String taskName) {
        TasksInner client = this.inner();
        return client.getAsync(groupName, serviceName, projectName, taskName)
        .map(new Func1<ProjectTaskInner, ProjectServiceProjectTask>() {
            @Override
            public ProjectServiceProjectTask call(ProjectTaskInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String groupName, String serviceName, String projectName, String taskName) {
        TasksInner client = this.inner();
        return client.deleteAsync(groupName, serviceName, projectName, taskName).toCompletable();
    }

}