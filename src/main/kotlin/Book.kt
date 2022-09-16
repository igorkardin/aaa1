class Book(override var price: Int, override var wordCount: Int) : Publication {

    override fun getType(): String {
        return if (wordCount > 10000)
            "Novel"
        else if (wordCount in 7500..10000)
            "Short Story"
        else
            "Flash  Fiction"
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Book) return false
        return other.price == price && other.wordCount == wordCount
    }

}