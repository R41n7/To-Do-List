interface Menu {
    fun startMenu() {
        println("\n1 - Показать весь список заметок\n" +
                "2 - Создать новую заметку\n" +
                "3 - Редактировать существующую заметку\n" +
                "4 - Удалить заметку\n" +
                "exit - Выйти из программы")
    }
}