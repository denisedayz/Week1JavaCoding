
public class Application {

	public static void main(String[] args) {
double itemCost = 1.25; 
double purchasePrice = 1.25; 
double cashInwallet = 5.00;
double moneyInwallet = 5.00;
int numberOffriends = 40;
int totalFriends = 40;
int myAge = 20;
int currentAge = 20;
String firstName = "Ross";
String first_Name = "Ross";
String lastName = "Geller";
String last_Name = "Geller";
char middleInitial = 'A';
char middle_Initial = 'A';
double leftoverMoney = cashInwallet - purchasePrice;
int friendsPeryear = totalFriends/currentAge;
String fullName = firstName + " " + middleInitial + " " + lastName;
System.out.println(itemCost);
System.out.println(purchasePrice);
System.out.printf("%.2f",cashInwallet);
System.out.println();
System.out.printf("%.2f",moneyInwallet);
System.out.println();
System.out.println(numberOffriends);
System.out.println(totalFriends);
System.out.println(myAge);
System.out.println(currentAge);
System.out.println(firstName);
System.out.println(first_Name);
System.out.println(lastName);
System.out.println(last_Name);
System.out.println(middleInitial);
System.out.println(middle_Initial);
System.out.println(leftoverMoney);
System.out.println(friendsPeryear);
System.out.println(fullName);
System.out.println("The cost of the ice pop is $" + itemCost + ".");
System.out.println("The cost of the pencil is $" + purchasePrice + ".");
System.out.printf("Before I went shopping I had $%.2f %s", cashInwallet, "in my wallet.");		
System.out.println();
System.out.printf("Sal has $%.2f %s", moneyInwallet, "in his wallet.");
System.out.println();
System.out.println("I am introverted, so I only have " + numberOffriends + " friends.");
System.out.println("He has " + totalFriends + " friends.");
System.out.println("I am " + myAge + " years old.");
System.out.println("Sarah is " + currentAge + ".");
System.out.println("Hello, my name is " + firstName + ".");
System.out.println("They named their baby " + first_Name + ".");
System.out.println("Her maiden name was " + lastName + ".");
System.out.println("After marriage, her last name is " + last_Name + ".");
System.out.println("My middle initial is " + middleInitial + ".");
System.out.println("My middle name is a secret, but my middle initial is " + middle_Initial + ".");
System.out.println("After I bought the ice pop, I only had $" + leftoverMoney + ".");
System.out.println("Over my lifetime, I have made " + friendsPeryear + " friends per year.");
System.out.println("His full name is " + fullName + ".");

		// TODO Auto-generated method stub

	}

}
