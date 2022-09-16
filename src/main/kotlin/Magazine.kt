class Magazine(override val price: Int, override val wordCount: Int) : Publication {
    override fun getType() = "Magazine"
}