/**
 * Created by ioan on 10/19/17.
 */
public class SubintervalSet {
    private int a;
    private int b;
    private int k;

    SubintervalSet(int valueofa,int valueofb,int valueofk)
    {
        setavalue(valueofa);
        setbvalue(valueofb);
        setkvalue(valueofk);

    }

    private void setavalue(int value)
    {
        this.a=value;
    }

    private void setbvalue(int value)
    {
        this.b=value;
    }

    private void setkvalue(int value)
    {
        this.k=value;
    }

    public void start()
    {
        subintervals(0,a,b);
    }

    private void subintervals(int ok,int min,int max)
    {
        int x,y;
        int r;
        if(ok==0) {
            r=(int)Math.ceil(((double)b-(double)a+1)/(double)k);
            x=a;
            y=a+r;
            subintervals(1,x,y);
            while(y<b){
                x=x+r;
                if(y+r>b)
                    y=b;
                else
                    y=y+r;
                subintervals(1,1+x,y);
            }

        }else{
            if(ok==1){
                IntervalsControl.mininterval[IntervalsControl.ninterval]=min;
                IntervalsControl.maxinterval[IntervalsControl.ninterval]=max;
                IntervalsControl.ninterval++;
            }
        }
    }

}
