package net.antikkup.plugins

import org.bukkit.plugin.java.JavaPlugin
import java.util.*

class Main : JavaPlugin() {
    lateinit var testLateInit: String

    var testNullableStuff: String? = null

    override fun onEnable() {
        logger.info("loaded")

        testLateInit = "jhon"

        testNullableStuff = "whatsupp?"

        logger.info("hi $testLateInit $testNullableStuff")

        val list = ArrayList<String>()

        list.add("kahverengi")
        list.add("you are awesome")

        list.forEach {
            logger.info("omg it works! -> $it")
        }
    }
}