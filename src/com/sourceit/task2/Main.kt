package com.sourceit.task2
import java.util.regex.Matcher
import java.util.regex.Pattern

fun main(args: Array<String>):Boolean {
    var pattern: Pattern? = null
    var matcher: Matcher? = null
    matcher = pattern!!.matcher(date)
    return if (matcher.matches()) {
        matcher.reset()
        if (matcher.find()) {
            val day = matcher.group(1)
            val month = matcher.group(2)
            val year = matcher.group(3).toInt()
            if (day == "31" &&
                (month == "4" || month == "6" || month == "9" || month == "11" || month == "04" || month == "06" || month == "09")
            ) {
                false
            } else if (month == "2" || month == "02") {
                //leap year
                if (year % 4 == 0) {
                    if (day == "30" || day == "31") {
                        false
                    } else {
                        true
                    }
                } else {
                    if (day == "29" || day == "30" || day == "31") {
                        false
                    } else {
                        true
                    }
                }
            } else {
                true
            }
        } else {
            false
        }
    } else {
        false
    }
}