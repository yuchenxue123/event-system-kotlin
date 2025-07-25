package cute.neko.event

import cute.neko.event.api.EventState

/**
 * @author yuchenxue
 * @date 2025/07/25
 */

enum class LifecycleEventState : EventState {

    /**
     * The event state before some actions.
     */
    PRE,

    /**
     * The event state after some actions.
     */
    POST

}