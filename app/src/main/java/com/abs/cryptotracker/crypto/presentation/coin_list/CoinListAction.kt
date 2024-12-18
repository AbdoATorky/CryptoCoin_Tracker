package com.abs.cryptotracker.crypto.presentation.coin_list

import com.abs.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi):CoinListAction
//    data object onRefresh:CoinListAction
}