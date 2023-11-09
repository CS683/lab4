package edu.bu.projectportal.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.bu.projectportal.Project

class CurProjectViewModel: ViewModel(){
    private val _curProject: MutableLiveData<Project> = MutableLiveData()
    val curProject: LiveData<Project> = _curProject

    // initialize the current project to be
    // the first project in the list
    init {
       _curProject.value = Project.projects[0]

    }

    fun setCurProject(project: Project){
        _curProject.value = project
    }

    fun updateCurProject(title:String, desp:String, authors:List<String>, link: String, keywords: Set<String>, isFavorite: Boolean){
        _curProject.value = _curProject.value?.apply{
            this.title = title
            this.description = desp
            this.authors = authors
            this.link = link
            this.keywords = keywords
            this.isFavorite = isFavorite
        }

    }

}