class TimerActivity : AppCompatActivity() {

    companion object {
        private const val MILLIS_IN_SECONDS = 1000L
        private const val INTERVAL = 1 * MILLIS_IN_SECONDS
        private const val TIME = 100 * MILLIS_IN_SECONDS
    }

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        textView = findViewById(R.id.text)
        object: CountDownTimer(TIME, INTERVAL) {

            override fun onTick(millisUntilFinished: Long) {
                textView?.text = getString(R.string.millis_until_finished, millisUntilFinished.toString())
            }

            override fun onFinish() {
               Toast.makeText(this@TimerActivityIn, R.string.timer_is_finished, Toast.LENGTH_SHORT).show()
            }

        }.start()
    }
}
