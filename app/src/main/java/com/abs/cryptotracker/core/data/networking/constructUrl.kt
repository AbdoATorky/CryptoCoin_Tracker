package com.abs.cryptotracker.core.data.networking

import com.abs.cryptotracker.BuildConfig

fun constructUrl(url : String):String{
    return when {
        url.contains(BuildConfig.Base_URL) -> url
        url.startsWith("/") -> BuildConfig.Base_URL + url.drop(1)
        else -> BuildConfig.Base_URL + url
    }
}