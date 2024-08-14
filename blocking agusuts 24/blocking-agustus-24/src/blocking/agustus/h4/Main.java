
package blocking.agustus.h4;

import java.sql.SQLException;

/**
 *
 * @author vfz
 */
public class Main {
    public static void main (String[]args){
        try{
            form form = new form();
            form.setVisible(true);
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
}
