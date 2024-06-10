class Adapter(items: List<User>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private val items = items.toMutableList()

    fun updateItems(newItems: List<User>) {
        items.clear()
        items.addAll(newItems)
    }

    fun addItem(user: User) {
        items.add(user)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflateView(parent, viewType)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    private fun inflateView(parent: ViewGroup, viewType: Int): View { ... }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(user: User) { ... }
    }
}
