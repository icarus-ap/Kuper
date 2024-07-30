package com.icarusap.uzuri2

import com.github.javiersantos.piracychecker.PiracyChecker
import com.icarusap.uzuri2.R
import dev.jahir.kuper.ui.activities.KuperActivity

class MainActivity : KuperActivity() {

    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = true
    override fun checkStores(): Boolean = true

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAivTOzynrNu7hvfVJHNhnhobJQ9BCMUdd2J8NXvEv8LRhyoGb+FaHAxZhHVYqGu72ZvH/PHDDxZ0I59TG4EjZIeUa4/0iY2KFD/TiVQ5oA8RPwiWcVhryQd8WN0BDA4hkNcbLV2zgK32BK62FvHXRBPBnXJcFbVUpJk06n6wtwDJT45pFSOS4k/QQIykaeqGX5R3sMO7NGKO1EbKPFa02ekDuJuRUe+rHLd7NTTMQ7gfwSBq0+f1UD6tAHvdlEbI6n7plyI0Pq49kJpGyexhM4CFamTht7cpSKdVsAM4W+OdzX8K16yk0gnUE6ld38PQ6O7kakAu4lveEFOswb3xacwIDAQAB"

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return if (BuildConfig.DEBUG) null else super.getLicenseChecker()
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled

    override fun defaultMaterialYouTheme(): Int = R.style.MyApp_Default_MaterialYou
    override fun amoledMaterialYouTheme(): Int = R.style.MyApp_Default_Amoled_MaterialYou
}
