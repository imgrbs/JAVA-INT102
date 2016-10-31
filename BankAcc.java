package javaapplication1;
public class JavaApplication1 {
    private String username;
    private int password;
    private int genotp =(int)(Math.random()*10000);
    
    public void setUsername(String user){
        username = user;
    }
    public String getUsername(){
        return username;
    }
    
    public void setPassword(int pass){
        password = pass;
    }
    public int getPassword(){
        return password;
    }
    public int getGenOtp(){
        return genotp;
    }
    
    //test genOTP
    public static void main(String[] args) {
        JavaApplication1 ja = new JavaApplication1();
        System.out.println(ja.getGenOtp());
    }
    
}
