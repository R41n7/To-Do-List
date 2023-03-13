class Note(): NotesElements(mutableList = mutableListOf()) {

    fun createNewNote() {
        do {
            println(
                "\nНапишите заметку.\n" +
                        "(back, чтобы вернуться назад)"
            )
            val input = readLine()!!.toString()
            inputIsBack(input)

            mutableList.add(input)
        } while (input != "back")
    }

    fun editNote() {
        listTest()
        showAllNotes()

        println("\nНапишите номер заметки, которую хотите заменить.\n" +
                "(back, чтобы вернуться назад)")

        val number = readLine()!!.toString()
        inputIsBack(number)

        println("\nНапишите заметку, которая заменит №$number\n" +
                "(back, чтобы вернуться назад)")

        val editedNote = readLine()!!.toString()
        inputIsBack(editedNote)

        mutableList[number.toInt() - 1] = editedNote
    }

    fun showAllNotes() {
        listTest()
        println("Список всех ваших заметок")
        for (i in 0 until mutableList.size) {
            println("${i + 1}: ${mutableList[i]}")
        }
    }

    fun deleteNote() {
        listTest()
        do {
            showAllNotes()
            println("\nНапишите номер заметки, которую хотите удалить.\n" +
                    "(back, чтобы вернуться назад)")

            val numberOfDeleteNote = readLine()!!.toString()
            inputIsBack(numberOfDeleteNote)
            mutableList.removeAt(numberOfDeleteNote.toInt() - 1)
        } while (numberOfDeleteNote != "back")
    }
}