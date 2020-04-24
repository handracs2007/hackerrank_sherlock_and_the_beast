// https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem

fun decentNumber(n: Int): Unit {
        // Let's assume the biggest number, all 5s
        var count5 = n
        var count3 = 0

        while (count5 % 3 != 0 || count3 % 5 != 0) {
            count5 -= 5
            count3 += 5
        }

        if (count3 > n || count5 > n) {
            println(-1)
        } else {
            repeat(count5) { print(5) }
            repeat(count3) { print(3) }
            println()
        }
}

fun main() {
    decentNumber(1)
    decentNumber(2)
    decentNumber(3)
    decentNumber(4)
    decentNumber(5)
    decentNumber(7)
    decentNumber(11)
}