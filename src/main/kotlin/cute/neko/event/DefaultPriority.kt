package cute.neko.event

import cute.neko.event.api.Priority

/**
 * @author yuchenxue
 * @date 2025/07/16
 */

enum class DefaultPriority(override val value: Int) : Priority {

    /**
     * Default priority level.
     */
    DEFAULT(100)

}