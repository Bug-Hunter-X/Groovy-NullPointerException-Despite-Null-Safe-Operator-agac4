```groovy
def myMethod(param) {
  if (param == null) {
    return "Null Input" // Handle null explicitly
  }
  // some code that uses param
  return param.toString()
}

println myMethod(null)

def anotherMethod(){
    def result = myMethod(null) ?: "Default Value" //Using Elvis operator
    println result
}

anotherMethod()
```