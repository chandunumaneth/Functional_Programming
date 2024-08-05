import scala.io.StdIn.readLine

object StudentRecords extends App {
    def getStudentInfo(): (String, Int, Int, Double, Char) = {

        println("Enter student's name:")
        val name = readLine()

        println("Enter marks obtained:")
        val marks = readLine().toInt

        println("Enter total possible marks:")
        val totalMarks = readLine().toInt

        if (validateInput(name, marks, totalMarks)._1) 
        {
            val percentage = (marks.toDouble / totalMarks) * 100
            val grade = if (percentage >= 90) 'A'
            else if (percentage >= 75) 'B'
            else if (percentage >= 50) 'C'
            else 'D'

            (name, marks, totalMarks, percentage, grade)
        }
        else 
        {
            println("Invalid input. Please try again.")
            getStudentInfo()
        }
    }

    def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    
        val (name, marks, totalMarks, percentage, grade) = record

        println(s"Student Name: $name")
        println(s"Marks Obtained: $marks")
        println(s"Total Marks: $totalMarks")
        println(s"Percentage: $percentage%")
        println(s"Grade: $grade")
    }

    def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    
        if (name.isEmpty) 
        {
            (false, Some("Name cannot be empty."))
        } 
        else if (marks < 0 || marks > totalMarks) 
        {
            (false, Some("Marks should be a positive integer and not exceed total marks."))
        } 
        else 
        {
            (true, None)
        }
    }

    def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
        
        var isValid = false
        var name = ""
        var marks = 0
        var totalMarks = 0

        while (!isValid) 
        {
            println("Enter student's name:")
            name = readLine()

            println("Enter marks obtained:")
            marks = readLine().toInt

            println("Enter total possible marks:")
            totalMarks = readLine().toInt

            val validation = validateInput(name, marks, totalMarks)
            isValid = validation._1

            if (!isValid) {
                println(s"Invalid input: ${validation._2.get}")
            }
        }

        val percentage = (marks.toDouble / totalMarks) * 100
        val grade = if (percentage >= 90) 'A'
        else if (percentage >= 75) 'B'
        else if (percentage >= 50) 'C'
        else 'D'

        (name, marks, totalMarks, percentage, grade)
    }

    // Main execution
    val studentRecord = getStudentInfoWithRetry()
    printStudentRecord(studentRecord)
}





