p = browserDriver.find_elements_by_tag_name("p")
  inputs = browserDriver.execute_script(
    "var p = arguments[0], inputs = []; for (var i=0; i < p.length; i++){" +
    "inputs.push(document.getElementById(p[i].getAttribute('for'))); } return inputs;", p)
  print(inputs)
