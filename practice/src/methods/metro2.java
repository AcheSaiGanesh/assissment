package methods;
import java.util.*;
public class metro2 {
	
    char ch,cho;
    int password,choice = 0, bal=0,to=0,from=0, amt = 0, line = 0, persons = 0, price = 0, temp = 0;
public void ticket() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter from station: ");
        from = s.nextInt();
        System.out.println("Enter destination station: ");
        to = s.nextInt();
        System.out.println("Enter the number of persons: ");
        persons = s.nextInt();
        temp = to - from;

        if (temp == 1) {
            price = persons * 10;
           
            if (bal > price) {
                System.out.println("Ticket booked successfully. Price: " + price);
            bal = bal - price;
            }
            else
                System.out.println("Unavailable balance, please recharge.");
        } else if (temp == 2) {
            price = persons * 15;
            if (bal > price) {
                System.out.println("Ticket booked successfully. Price: " + price);
                bal = bal - price;}
            else
                System.out.println("Unavailable balance, please recharge.");
        } else if (temp == 3) {
            price = persons * 20;
           
            if (bal > price) {
                System.out.println("Ticket booked successfully. Price: " + price);
                bal = bal - price;}
            else
                System.out.println("Unavailable balance, please recharge.");
        } else if (temp == 4) {
            price = persons * 25;
            if (bal > price) {
                System.out.println("Ticket booked successfully. Price: " + price);
                bal = bal - price;}
            else
                System.out.println("Unavailable balance, please recharge.");
        } else if (temp == 5) {
            price = persons * 30;
            if (bal > price) {
                System.out.println("Ticket booked successfully. Price: " + price);
                bal = bal - price;}
            else
                System.out.println("Unavailable balance, please recharge.");
        } else if (temp > 5) {
            price = persons * 35;
            if (bal > price) {
                System.out.println("Ticket booked successfully. Price: " + price);
                bal = bal - price;}
            else
                System.out.println("Unavailable balance, please recharge.");
        } 
        System.out.println("do you want to book more tickets:");
        cho=s.next().charAt(0);
        if(cho=='y') {
        	bookmore();
        }
        else if(cho =='n') {
        	return;
        }
        
        else {
        	System.out.println("enter a valid choice");
        }
      
    }
public void bookmore() {
	Scanner s = new Scanner(System.in);
    System.out.println("1. Red line: L.B. Nagar -> Miyapur");
    System.out.println("2. Blue line: Nagole ----> Raidurg");
    System.out.println("3. Green line: JBS ------> MGBS");
    System.out.print("plz Enter the line: ");
    line = s.nextInt();

    switch (line) {
        case 1: {
            System.out.println("0. Miyapur  1. JNTU  2. KPHB  3. Kukatpally  4. SR Nagar  5. L.B. Nagar");
            ticket();
            break;
        }
        case 2: {
            System.out.println("0. Raidurg  1. Begumpet  2. Rasoolpura  3. ...  4. Uppal  5. Nagole");
            ticket();
            break;
        }
        case 3: {
            System.out.println("0. Secunderabad  1. RTC X Roads  2. Narayanaguda  3. Sulthan Bazar  4. Gandhi Hospital  5. MGBS");
            ticket();
            break;
        }
        default:
            System.out.println("Invalid line choice.");
    }
    
    
}

    public static void main(String[] args) {
        String username,name;
        int password,passcode;
        metro2 m = new metro2();
        Scanner s = new Scanner(System.in);

        System.out.println("Register to login:");
        System.out.println("enter your name: ");
        name=s.next();
        System.out.println("enter your passcode");
        passcode=s.nextInt();
        for(;1>0;) {
        	System.out.println("plz login to continue");
        System.out.println("Enter the username:");
        username = s.next();
        System.out.println("Enter the password:");
        password = s.nextInt();
        if(username.equals(name)&&password==passcode) {
for(;1>0;) {
	
	System.out.println("*********************hyderabd metro*********************");
	System.out.println("=============plz select your choice=====================");
        System.out.print("1. Recharge Metro Card    ");
        System.out.println("       2. Book Tickets");
        System.out.print("3. View Balance      ");
        System.out.println("            4. View Last Ticket Details");
        System.out.println("                  5.Logout");
        System.out.println("================================================================");
        System.out.print("Enter your choice: ");
        m.choice = s.nextInt();

        switch (m.choice) {
            case 1: {
                System.out.print("Enter amount to recharge Metro Card: ");
                m.amt = s.nextInt();
                m.bal = m.bal + m.amt;
                System.out.println("Recharge successful");
                break;
            }

            case 2: {
            	m.bookmore();
            }

            case 3: {
                System.out.println("Balance = " + m.bal);
                break;
            }

            case 4: {
                System.out.println("source   "+m.from+"------>destination  "+m.to+"   no of tickets="+m.persons);
                break;
            }

            case 5: {
                System.out.println("Logged out. plz login to continue");
                break;
            }

            default:
                System.out.println("Invalid choice.");
        }
        if(m.choice==5)
        	break;
    }

        
    }  
        else System.out.println("invalid credintials");
    }
        
}
}


