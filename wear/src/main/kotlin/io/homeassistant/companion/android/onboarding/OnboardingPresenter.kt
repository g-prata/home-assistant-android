package io.homeassistant.companion.android.onboarding

import android.content.Context


interface OnboardingPresenter {

    fun onInstanceClickedWithoutApp(context: Context, url: String)

    fun onFinish()

    /**
     * Optionally parse a HomeAssistantInstance from a JSON string.
     * Default implementation can be provided in the implementation class.
     */
    fun getInstance(json: String): HomeAssistantInstance
}
