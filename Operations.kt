import kotlin.system.exitProcess

class Operations {
    fun actions() {
        do {
            note.startMenu()
            val inputNumber = readLine()!!.toString()
            when (inputNumber) {
                "1" -> note.showAllNotes()
                "2" -> note.createNewNote()
                "3" -> note.editNote()
                "4" -> note.deleteNote()
                "exit" -> exitProcess(0)
            }
        } while (inputNumber != "exit")
    }
}