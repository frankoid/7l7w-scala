class Person(firstName: String)
{
  println("Outer constructor")
  def this(firstName: String, lastName: String)
  {
    this(firstName)
    println("Inner constructor")
  }

  def talk() = println("Hi")
}

var martin = new Person("Martin")
var martinDevereux = new Person("Martin", "Devereux")
