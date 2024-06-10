class CustomActivity : AppCompatActivity() {

    private val locationCallback = CustomLocationCallback()
    private var locationClient: FusedLocationProviderClient? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        locationClient = LocationServices.getFusedLocationProviderClient(this)
    }

    override fun onResume() {
        super.onResume()
        if (isPermissionGranted()) {
            locationClient!!.lastLocation.addOnSuccessListener(::onLastLocation)
            locationClient!!.requestLocationUpdates(LocationRequest.create(), locationCallback, Looper.getMainLooper())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (isPermissionGranted()) {
            locationClient!!.removeLocationUpdates(locationCallback)
        }
    }

    private fun onLastLocation(location: Location) { ... }

    private fun isPermissionGranted(): Boolean { ... }
}
