package com.raj.docbuilder.vm

import com.raj.mylibrary.MviEffect
import com.raj.mylibrary.MviEvent
import com.raj.mylibrary.MviState
import com.raj.mylibrary.MviViewModel

class DocVM : MviViewModel<ViewState, ViewEvents, ViewEffect>(
    ViewState()
) {
    override suspend fun handleEffects(effect: ViewEffect) {

    }

    override suspend fun handleEvents(event: ViewEvents) {

    }
}

data class ViewState(
    var status: String = "",
) : MviState

sealed class ViewEvents : MviEvent {

}

sealed class ViewEffect : MviEffect