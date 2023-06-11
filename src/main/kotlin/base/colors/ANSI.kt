package base.colors

fun main() {
    foregroundColors16bit()
    backgroundColors16bit()
    colors256bit()
    rgbForegroundColor(
        "Hello!", RGB(255, 255, 0)
    )
    grbForegroundBackgroundColor(
        "Hello!", f = RGB(255, 255, 0), b = RGB(255, 0, 0)
    )
}

private fun foregroundColors16bit() {
    for (i in 30..37) print("\u001b[${i}m $i")
    println("\n")
    for (i in 90..97) print("\u001b[${i}m $i")
    println("\u001B[0m") // reset
}

private fun backgroundColors16bit() {
    for (i in 40..47) print("\u001b[${i}m $i")
    for (i in 100..107) print("\u001b[${i}m $i")
    println("\u001B[0m") // reset
}

private fun colors256bit() {
    println("\n")

    // Standard foreground colors
    for (i in 0..15) print("\u001b[38;5;${i}m $i")

    // 216 foreground colors
    for (i in 16..231) {
        if ((i - 16) % 36 == 0) println()
        print("\u001b[38;5;${i}m $i")
    }
    println("\u001B[0m")

    // Foreground grayscale shades
    for (i in 232..255) print("\u001b[38;5;${i}m $i")
    println()

    // Standard background colors
    for (i in 0..15) print("\u001b[48;5;${i}m $i")

    // 216 background colors
    for (i in 16..231) {
        if ((i - 16) % 36 == 0) println("\u001B[0m")
        print("\u001b[48;5;${i}m $i")
    }
    println("\u001B[0m")

    // Background grayscale shades
    for (i in 232..255) print("\u001b[48;5;${i}m $i")
    println("\u001B[0m")
}

private fun rgbForegroundColor(value: String, rgb: RGB) {
    println("\nRGB foreground color:")
    println("\u001b[38;2;${rgb.red};${rgb.green};${rgb.blue}m$value\u001B[0m")
}

private fun grbForegroundBackgroundColor(value: String, f: RGB, b: RGB) {
    println("\nRGB foreground and background color:")
    println("\u001b[38;2;${f.red};${f.green};${f.blue};48;2;${b.red};${b.green};${b.blue}m$value\u001B[0m")
}

data class RGB(val red: Int, val green: Int, val blue: Int)