import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val testCase = scanner.nextInt() // Number of test cases
    for (t in 0 until testCase) {
        val problems = scanner.nextInt()  // Number of problems in this test case
        val difficult = IntArray(problems) // Array to store difficulty of problems
        var solve = 0                      // To count how many problems can be solved
        var ambiguous = false
        for (i in difficult.indices) {
            difficult[i] = scanner.nextInt()
            if (difficult[0] >= problems) {
              ambiguous = true
            }
            if (difficult[i] < problems) {  // Check if the problem can be solved
                solve++
            }
            else {
                
                
            }
        }
        
        if (solve > 0 && !ambiguous) {
            println(solve)
        } else {
            println("Ambiguous")
        }
    }
    scanner.close()
}
