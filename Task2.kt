fun createResultString(users: List<User>): String {
    var output = ""
    for (user in users) {
        output = output + "Имя: " + user.name + ", Возраст: " + user.age + "\n"
    }
    return output
}
