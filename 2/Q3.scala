def normalHourCalc(hours: Float): Float = {
  250 * hours;
}

def otHourCalc(hours: Float): Float = {
  40 * hours;
}

def payment(normalHour: Float, otHour: Float): Float = {
  return normalHourCalc(normalHour) + otHourCalc(otHour);
}

def taxCalc(income: Float): Float = {
  return income * 0.12f;
}

def salaryCalc(normalHour: Float, otHour: Float): Float = {
  return payment(normalHour, otHour) - taxCalc(
    payment(normalHour, otHour)
  )
}

object MyApp extends App() {
    println (salaryCalc(2,3))
}