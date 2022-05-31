package interfaces2;

import java.util.HashMap;

public class AutenticadorDeUsuarios {
    private HashMap<String,String> bd;
    
    public AutenticadorDeUsuarios(){
        bd = new HashMap();
        bd.put("maria", "123");
        bd.put("joão", "123");
        bd.put("microsoft", "abc");
    } 
           
    public boolean autenticar(Usuario e){
        String passwordBD = bd.get(e.getLogin());
        if (passwordBD != null){
            if (passwordBD == e.getPassword()){
                return true;
            }
        }
        return false;
    }
}
