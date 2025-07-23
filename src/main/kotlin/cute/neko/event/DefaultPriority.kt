package cute.neko.event

import cute.neko.event.api.Priority

enum class DefaultPriority(override val value: Int) : Priority {

    /**
     * Default priority level.
     */
    DEFAULT(100)

}