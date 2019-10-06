//Async Script execution of a JavaScript Code in Python 
execute_async_script(script, *arguments)

driver.execute_async_script("return Math.PI")
//Above code prints value of mathematical constant PI (22/7)

driver.execute_async_script("function myFunction(a, b) { return a*b;}", 5,125)
//Above code prints 625
