package com.abs.cryptotracker.crypto.presentation.coin_list

import com.abs.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError):CoinListEvent
}