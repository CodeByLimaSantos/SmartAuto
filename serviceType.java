package service;

public class ServiceType {
	private String scheduleDate;
	private String typeofservice;
	private String status;
	
	public ServiceType(String scheduleDate, String typeofservice, String status) {
		super();
		this.scheduleDate = scheduleDate;
		this.typeofservice = typeofservice;
		this.status = "Scheduled";
	}
	
		public void confirmService () {
			
			this.status = "Service completed!";
			
		}
		
		public void cancelService () {
			
			this.status = "Service canceled!";
			
		}
		
		public void showService ( ) {
			System.out.println("----Service Details----");
			System.out.println("Schedule Data :  " + this.scheduleDate ) ;
			System.out.println("Type of service  :  " + this.typeofservice ) ;
			System.out.println("Status of service  :  " + this.status ) ;
			System.out.println(" --------------- " ) ;
		}

	

}
