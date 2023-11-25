/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternetBill;

/**
 *
 * @author Asus
 */
public class InternetBill {
    
    private String name, phone, speed, period;
    private int id;
    private double totalAmount;
    
    public InternetBill(int id, String name, String phone, String speed, String period){
        
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.speed = speed;
        this.period = period;
        
    }
    
    public void calculateBill(){
        
        if(period.equals("Month")){
            
            switch(speed){
                
                case("30 Mbps"):totalAmount=100;break;
                case("100 Mbps"):totalAmount=200;break;
                case("150 Mbps"):totalAmount=300;break;
                
            }
            
        }
        else {
            
            switch(speed){
                
                case("30 Mbps"):totalAmount=(100*12)-(100*12*0.1);break;
                case("100 Mbps"):totalAmount=(200*12)-(200*12*0.1);break;
                case("150 Mbps"):totalAmount=(300*12)-(300*12*0.1);break;
                
            }
            
        }
    }
    
    public double getTotalAmount(){
        
        return totalAmount;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getSpeed(){
        return speed;
    }
    
    public String getPeriod(){
        return period;
    }
    
    public String toString(){
        
        return"Customer ID: "+id
                +"\nCustomer Name: "+name
                +"\nCustomer Phone Number: "+phone
                +"\nSubscription: "+speed
                +"\nPeriod of Time: "+period
                +String.format("\nTotal Amount: RM %.2f\n\n",totalAmount);
        
    }
    
    public String toStringForFile(){
        
        return String.format("%-13s%-15s%-17s%-17s%-20s%-17s%n", id, name, phone, speed, period, totalAmount);
        
    }
    
}
