fun String.estVideOuBlanche(): Boolean {
    return this.trim().isEmpty()
}

fun String.sigle(): String {
    val words = this.split("\\s+".toRegex())
    return words.joinToString(separator = "") { it.first().toUpperCase().toString() }
}
