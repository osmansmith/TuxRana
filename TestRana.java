import java.util.ArrayList;
import java.util.Random;
public class TestRana
{
 
    ArrayList miArray=new ArrayList();
    ArrayList miArray2=new ArrayList();
    ArrayList miArray3=new ArrayList();
    
    public TestRana()
    {
            main();
    }
    
    private void creaLibelulas(int limite, int azar){
        
        Random miRandom=new Random(); 
        for(int i=0;i<=limite-1;i++){
            Libelula miLibelula=new Libelula(miRandom.nextInt(azar));
            miArray.add(miLibelula);
        }               
    }
    private void creaRanas(int limite, int azar){
        
         Random miRandom=new Random();
         for (int c=0;c<=limite-1;c++){
             Rana miRana=new Rana(miRandom.nextInt(azar));
             miArray2.add(miRana);
            }
    }
    private void creaIslotes(int limite, int azar){
        
         Random miRandom=new Random();
         for (int c=0;c<=limite-1;c++){
             Islote miIslote=new Islote(miRandom.nextInt(azar));
             miArray3.add(miIslote);
            }
    }
    
    private void main(){
        //Creamos Libelulas primer parametro, son el total de libelulas, el segundo, el limite de numeros random
        this.creaLibelulas(60,30);
        //Creamos Libelulas primer parametro, son el total de libelulas, el segundo, el limite de numeros random
        this.creaRanas(20,40);
        //Creamos Libelulas primer parametro, son el total de libelulas, el segundo, el limite de numeros random
        this.creaIslotes(30,60);
        //Creamos TuxRana(nuestra heroina) version 1
        TuxRana miTr =new TuxRana();
        
        
        //Pasan las libelulas a TuxRana
        for(int a=0;a<=59;a++){
            miTr.atrapaLibelula((Libelula)miArray.get(a));           
        }
   
        if(miTr.getLibelulasNull()<10){
            
            System.out.println("TuxRana se comio "+miTr.getLibelulasNull()+" BotWinLibelulas, sobrevivió y pasó el descampado .");
            
            TuxRanaV2 miTr2= new TuxRanaV2();            
            for(int b=0;b<=19;b++){
                miTr2.detectaBotRana((Rana)miArray2.get(b));
            }
            if(miTr2.getEbr()<10){
                System.out.println("TuxRana se encontro con "+miTr2.getEbr()+" BotWinRanas, sobrevivió y pasó el Bosque.");
                
                    TuxRanaV3 miTr3= new TuxRanaV3();            
                    for(int c=0;c<=29;c++){
                        miTr3.detectaBotIsla((Islote)miArray3.get(c));
                    }
                    if(miTr3.getBotIsla()<2){
                        System.out.println("TuxRana paso la laguna de agua y se ha convertido en una princesa. :D, Felicidades !!!");
                        
                    }
                    
                    else{
                        System.out.println("Game Over - perdiste como todo un heroe en la laguna de agua. cayendo "+miTr3.getBotIsla()+" Veces");
                    }
            }
            
            else{
                System.out.println("Game Over - Te mataron "+miTr2.getEbr()+" BotWinRanas en el Bosque");
            }
        
        }
        
        else
        {
         System.out.print("Game Over - Te mataron las botLibelulas, en el Descampado juajuajua");   
        } 
    }


}
