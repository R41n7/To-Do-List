interface CheckingNotes {
    fun listTest() {
        if (note.mutableList.isEmpty()) {
            println("У вас нет существующих заметок")
            activities.actions()
        }
    }
}