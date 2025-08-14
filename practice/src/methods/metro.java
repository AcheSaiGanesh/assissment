package methods;
import java.util.Scanner;

public class metro {


	// TODO Auto-generated method
	public static void main(String[] args) {
		String username;
		char ch;
		int password,choice=0,bal=0,amt=0,line=0,from=0,to=0,persons=0,price=0,temp=0;
		
		Scanner s =new Scanner(System.in);
		System.out.println("register to login:");
		System.out.println("enter the username:");
		username=s.next();
		System.out.println("enter the password:");
		password=s.nextInt();
		
		System.out.println("1.recahrge metrocard:   2.booktickets:  3.viewbalance:  4.view last ticket details:  5.logout");
		System.out.println("enter your choice:");
		choice=s.nextInt();
		switch(choice) {
		case 1:{
			System.out.print("enter amount to recharge metrocard:");
			amt=s.nextInt();
			bal=bal+amt;
			System.out.println("recharge sucessfull");
			break;
		} 
		case 2:{
			System.out.print("1.red line=l.b nagar->miyapur: 2.blueline:nagole->raidurg: 3.greenline: jbs->mgbs:");
			System.out.println("enter the line:");
			line=s.nextInt();
			switch(line){
			case 1:{
				System.out.println("0.miyapur  1.jntu   2.kphb  3.kukatpally 4.sr nagar  5.lbnagar");
				
				System.out.println("enter from station");
				from=s.nextInt();
				System.out.println("enter destination station");
				to=s.nextInt();
				System.out.println("enter the nom of persons:");
				persons=s.nextInt();				
				temp=to-from;
				if(temp==1) {
				price=persons*10;
				bal=bal-price;
				if(bal>price) 
				System.out.println("ticket booked  sucessfully price:"+price);
				else
				System.out.println("unavilable balance plz recharge:");
				}
				else if(temp==2) {
				price=persons*15;
				if(bal>price) 
				System.out.println("ticket booked  sucessfully price:"+price);
				else
				System.out.println("unavilable balance plz recharge:");
				}
				else if(temp==3) {
					price=persons*20;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}
				else if(temp==4) {
					price=persons*25;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}	
				else if(temp==5) {
					price=persons*30;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}
				else if(temp>5) {
					price=persons*35;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}	
			}
			
			
			case 2:{
				System.out.println("0.raidurg  1.begumpet  2.rasoolpura  3. 4.uppal  5.nagole");
				System.out.println("enter from station");
				from=s.nextInt();
				System.out.println("enter destination station");
				to=s.nextInt();
				System.out.println("enter the nom of persons:");
				persons=s.nextInt();				
				temp=to-from;
				if(temp==1) {
				price=persons*10;
				bal=bal-price;
				if(bal>price) 
				System.out.println("ticket booked  sucessfully price:"+price);
				else
				System.out.println("unavilable balance plz recharge:");
				}
				else if(temp==2) {
				price=persons*15;
				bal=bal-price;
				if(bal>price) 
				System.out.println("ticket booked  sucessfully price:"+price);
				else
				System.out.println("unavilable balance plz recharge:");
				}
				else if(temp==3) {
					price=persons*20;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}
				else if(temp==4) {
					price=persons*25;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}	
				else if(temp==5) {
					price=persons*30;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}
				else if(temp>5) {
					price=persons*35;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}	
			}
			case 3:{
				System.out.println("0.secunderabad  1.rtc x roads    2.narayanaguda  3.sulthan bazar 4.gandhihospital  5.mgbs");
				System.out.println("enter from station");
				from=s.nextInt();
				System.out.println("enter destination station");
				to=s.nextInt();
				System.out.println("enter the nom of persons:");
				persons=s.nextInt();				
				temp=to-from;
				if(temp==1) {
				price=persons*10;
				bal=bal-price;
				if(bal>price) 
				System.out.println("ticket booked  sucessfully price:"+price);
				else
				System.out.println("unavilable balance plz recharge:");
				}
				else if(temp==2) {
				price=persons*15;
				bal=bal-price;
				if(bal>price) 
				System.out.println("ticket booked  sucessfully price:"+price);
				else
				System.out.println("unavilable balance plz recharge:");
				}
				else if(temp==3) {
					price=persons*20;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}
				else if(temp==4) {
					price=persons*25;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}	
				else if(temp==5) {
					price=persons*30;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					}
				else if(temp>5) {
					price=persons*35;
					bal=bal-price;
					if(bal>price) 
					System.out.println("ticket booked  sucessfully price:"+price);
					else
					System.out.println("unavilable balance plz recharge:");
					
					}	
			}
			
			}
		}
		
		
		
		case 3:{
			System.out.println("balance="+bal);
			break;
		}
		case 4:{
			
			break;
		}
		case 5:{
			break;
		}
		
		}

	}

}
