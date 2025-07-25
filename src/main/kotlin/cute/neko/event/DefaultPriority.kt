package cute.neko.event

import cute.neko.event.api.EventPriority

enum class DefaultPriority(override val value: Int) : EventPriority {

    /**
     * Default priority level.
     */
    DEFAULT(100)

}