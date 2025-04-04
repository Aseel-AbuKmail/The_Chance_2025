fun isValidIPv4(ip: String): Boolean {
    val segments = ip.split(".")

    // Must contain exactly 4 segments
    if (segments.size != 4) return false

    for (segment in segments) {
        // Each segment should be numeric
        if (!segment.matches(Regex("\\d+"))) return false

        // Convert to integer
        val num = segment.toIntOrNull() ?: return false

        // Each number must be between 0 and 255
        if (num !in 0..255) return false

        // No leading zeros allowed (except for "0" itself)
        if (segment.length > 1 && segment.startsWith("0")) return false
    }

    return true
}
