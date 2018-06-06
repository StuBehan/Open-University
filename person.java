public class Person
{

private String firstName;
private String secondName;

public Person(String first, String second)
{

this.firstName = first;
this.secondName = second;

}

public Person(String, second)
{

this("", second);

}

public String getInitials()
{

return "" + this.firstName.charAt(0) + this.secondName.charAt(0);

}

public String getName()
{

return this.firstName + " " + this.secondName;

}

public void printReverse()
{

string result = this.getName();

for(int i = result.length() - 1; i >= 0; i--)
  {
    system.out.print(result.charAt(i);
  }

}

}
