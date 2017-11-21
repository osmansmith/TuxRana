
/**
 * Write a description of class TuxRanaV3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TuxRanaV3 extends TuxRanaV2
{
    protected boolean saltar=true;
    protected int botIsla=0;
    
    public TuxRanaV3()
    {
      
    }
    public void detectaBotIsla(Islote laIsla){
      
       int num=laIsla.getIdentificador(); 
          if(num != 0)
          {
            if(7%num==0 || 3%num==0){
               botIsla++; 
            }
          }
       
       
    }
    public int getBotIsla()
    {
        return(this.botIsla);
    }
   
}
