class Book(override val price: Int, override val wordCount: Int) : Publication {

    override fun getType(): String {
        return when (wordCount) {
            in 10000.. Int.MAX_VALUE -> "Novel"
            in 7500 until  10000 -> "Short Story"
            else -> "Flash  Fiction"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Book) return false
        return other.price == price && other.wordCount == wordCount
    }

}