class AppPreferences(private val preferences: SharedPreferences) {

    companion object {
        private const val ONBOARDING_KEY = "ONBOARDING_KEY"
        private const val PROMO_KEY = "PROMO_KEY"
    }

    var onboardingWasShown: Boolean
        get() = preferences.getBoolean(ONBOARDING_KEY, false)
        set(value) {
            preferences.edit().putBoolean(ONBOARDING_KEY, value)
        }

    var promoWasShown: Boolean
        get() = preferences.getBoolean(PROMO_KEY, false)
        set(value) {
            preferences.edit { putBoolean(ONBOARDING_KEY, value) }
        }
}
