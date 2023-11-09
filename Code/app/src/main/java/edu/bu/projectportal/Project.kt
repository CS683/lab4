package edu.bu.projectportal

data class Project(val id: Int, var title: String, var description: String, var authors :List<String> = listOf("Shanghua Yang"), var link: String = "www.google.com", var keywords : Set<String> = setOf("project"), var isFavorite: Boolean = false){
    companion object {
        val projects = mutableListOf(
            Project(0, "Weather Info", "Weather Forcast is an app ..."),
            Project(1, "Connect Me", "Connect Me is an app ... "),
            Project(2, "What to Eat", "What to Eat is an app ..."),
            Project(3, "Project Portal", "Project Portal is an app ..."),
            Project(4, "Smart Sense", "Smart sense is an app ..."))

    }
}