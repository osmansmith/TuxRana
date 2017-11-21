
public class TuxRanaV2 extends TuxRana
{
    protected boolean croar=true;
    protected int ebr=0;
    
    public void detectaBotRana(Rana laRana){
       int vdxc=0;
       int limite=laRana.getIdentificador(); 
        for(int b=2;b<limite;b++){
            if(limite%b==0){
               vdxc=vdxc+1; 
            }
        }
        if (vdxc==0){
           ebr=ebr+1; 
        }
    }
    public int getEbr(){
        return(this.ebr);
    }
}
