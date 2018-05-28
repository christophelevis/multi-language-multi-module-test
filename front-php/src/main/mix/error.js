
//TODO

a = true;
if (a) { // Noncompliant
  doSomething();
}
if (b && a) { // Noncompliant; "a" is always "true"
  doSomething();
}
if (c || !a) { // Noncompliant; "!a" is always "false"
  doSomething();
}

if (b == 0) {  // Noncompliant
  doOneMoreThing();
}
else {
  doOneMoreThing();
}

let a = (b == 0) ? getValue() : getValue();   // Noncompliant

switch (i) {  // Noncompliant
  case 1:
    doSomething();
    break;
  case 2:
    doSomething();
    break;
  case 3:
    doSomething();
    break;
  default:
    doSomething();
}
