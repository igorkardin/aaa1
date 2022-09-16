interface Publication {
    val price: Int
    val wordCount: Int

    fun getType(): String
    fun out(): String {
        return "Price = $price euro, Word Count = $wordCount and Type = ${getType()} "
    }
}
