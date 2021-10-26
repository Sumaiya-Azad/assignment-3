
class Phone{
//	int ram, internal_store;
	String processor,ram, internal_store;
	Phone(){
		
}
Phone(String ram, String internal_store){
	this.ram=ram;
	this.internal_store=internal_store;
	}
	Phone(String ram2, String internal_store2, String processor2){
			this.ram=ram2;
        	this.internal_store=internal_store2;
	         this.processor=processor2;
	}
	void display(){
		System.out.println("RAM of the phone: "+ram);
			System.out.println("Internal storeage of the phone: "+internal_store);
   	System.out.println("Processor of the phone: "+processor);
   	System.out.println("\n");
}
}

public class task1 {
	public static void main(String[] args) {
		Phone A1= new Phone();
		A1.display();
		
		Phone A2= new Phone("4GiB", "128GB");
		A2.display();
		
		Phone A3= new Phone("6GB", "258GB"," MediaTek Helio G95 ");
		A3.display();
		
	}
}