package com.github.gunnarahlberg.pgintellijziglang.services

import com.intellij.openapi.project.Project
import com.github.gunnarahlberg.pgintellijziglang.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
