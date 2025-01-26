```groovy
def myMethod(param) {
  if (param == null) {
    return null //This will cause NullPointerException later
  }
  // some code that uses param
}

println myMethod(null)

def anotherMethod(){
    def result = myMethod(null)?.toString() //NullPointerException
    println result
}

anotherMethod() //NullPointerException is thrown here
```