class Calculator {
private int x; // private is just a best practice for class variables
private int y; // private is just a best practice for class variables


/* 
 A Java Method looks like this, most other langauges call them Functions. 
 This is typically a bite-sized piece of code that we put to use in our Main class, 
 also sometimes called the  "driver" or "tester" class.
*/
public int add(int x, int y) 
{
int addResult;

addResult = x + y;

return addResult;
  
}

public int sub(int x, int y)
{
int subResult;

subResult = x - y;

return subResult;

}

public int mult(int x, int y)
{
  int multResult;

  multResult = x * y;

  return multResult;
}

public float div(float x, float y)
{
  float divResult;

  divResult = x / y;

  return divResult;
}






  
}
