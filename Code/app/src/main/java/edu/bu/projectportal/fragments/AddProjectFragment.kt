package edu.bu.projectportal.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import edu.bu.projectportal.Project
import edu.bu.projectportal.R

class AddProjectFragment : Fragment(R.layout.fragment_add_project) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSubmit: Button = view.findViewById(R.id.btnSubmit)
        val projectTitle = view.findViewById<EditText>(R.id.EditProjectTitle)
        val projectDesc = view.findViewById<EditText>(R.id.EditProjectDesc)

        btnSubmit.setOnClickListener {
            val position = Project.projects.size
            val newProject = Project(
                id = Project.projects.size,
                title = projectTitle.text.toString(),
                description = projectDesc.text.toString()
            )
            Project.projects.add(newProject)
            val action = AddProjectFragmentDirections.actionAddProjectFragmentToDetailFragment()
            findNavController().navigate(action)
        }
    }
}
