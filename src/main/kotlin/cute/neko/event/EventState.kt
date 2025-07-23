package cute.neko.event

import cute.neko.event.api.State

/**
 * @author yuchenxue
 * @date 2025/07/23
 */

enum class EventState : State {
    PRE,
    POST,
    SEND,
    RECEIVE,
}