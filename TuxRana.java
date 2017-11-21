
/**
 * Write a description of class TuxRana here.
 * 
 * @author (Vader) 
 * @version (v1 20112017)
 */
public class TuxRana
{
    // instance variables - replace the example below with your own
    protected boolean comeLibelulas=true;
    protected int libnull=0;


    public TuxRana()
    {

    }
    public void atrapaLibelula(Libelula laLibelula){
      
           if(laLibelula.getIdentificador()==10){
                this.libnull=this.libnull+1;
            }        
    }
    public int getLibelulasNull(){
        return(this.libnull);
    }
}
