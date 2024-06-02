package com.beslan.terminalexchange.presentation

import com.beslan.terminalexchange.data.Bar

sealed class TerminalScreenState {

    object Initial: TerminalScreenState()

    object Loading: TerminalScreenState()

    data class Content(val barList: List<Bar>, val timeFrame: TimeFrame): TerminalScreenState()

}