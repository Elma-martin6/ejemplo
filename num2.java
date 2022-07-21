import java.util.Scanner; 
public class num2 {
    public static void main(String[] args){
    	
    	System.out.println("\nSUMA DE LAS CIFRAS");
    	System.out.println("==============================\n ");
    	
    	Scanner result=new Scanner(System.in);
    	int num1;
    	System.out.print("Ingrese un numero: ");
    	num1=result.nextInt();
    	
    	SumarCifras(num1);
    }
    
    static void SumarCifras(int num1){
    	int num2,sumDig=0;
    	num2=num1;
    	if(num1<10){
    		System.out.print("\nEl numero "+num1+" solo tiene una cifra");
    		System.out.println("\n\n==============================\n ");
    	}
    	else{
    		while(num1>0){
    			sumDig= sumDig+ (num1%10);
    			num1=num1/10;
    		}
    		System.out.println("\n==============================");
	    	System.out.println("\nLa suma de los digitos de "+ num2+ " es: "+ sumDig);
    	}
    }
    
}