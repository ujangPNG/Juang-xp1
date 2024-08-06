package array; public class array1 {
    private String[] mhs;
    private int[] deret;
    private int hasilJum;
    
    public void setMhs(String[]mhs){
        this.mhs=mhs;
        mhs=null;
    }
    
    public String[]getMhs(){
        return mhs;
    }
    
    public void setDeret(int[]deret){
        this.deret=deret;
        deret=null;
    }
    
    public int[]getDeret(){
        return deret;
    }
    
    public void setJum(int[]deret){
        hasilJum=0;
        for(int i=0;i<deret.length;i++){
            hasilJum+=deret[i];
        }
        deret=null;
    }
    
    public int getJum(){
        return hasilJum;
    }
    
    public void tampil(String a){
        System.out.println(a);
        a=null; 
    }
    
    public void tampil(String a[]){
        String data="";
        for(int i=0;i<a.length;i++){
            if(i==0)
            {
                data+=a[i];
            }else{
                data+=", "+a[i];
            }
        }
        System.out.println(data);
        a=null;
        data=null;}
    
    public void tampil(int a){
        System.out.println(a);
    }
    
    public void tampil(int a[]){
        String data="";
        for(int i=0 ; i<a.length ; i++){
            if(i==0){
                data+=a[i];
            }else{
                data+=", "+a[i];
            }
        }
        System.out.println(data); 
        a=null;
        data=null;
    }
    
    public void hapus(){
        mhs=null;
        deret=null;
        hasilJum=0;
    }
}
