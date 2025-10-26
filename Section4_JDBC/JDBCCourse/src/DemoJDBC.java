import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) {
        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close 
        */
        Connection con=null;
        try {
            String url = "jdbc:postgresql://localhost:5432/demo";
            String uname="postgres";
            String password = "root";
            String sql = "select sname from student where sid = 1";

            //loads the driver into memory
            //When the class is loaded, it registers itself automatically with the DriverManager.
            Class.forName("org.postgresql.Driver");

            //establish the connection with postgres
            con = DriverManager.getConnection(url, uname, password);

            Statement st = con.createStatement();
            
            //execute the query
            ResultSet rs = st.executeQuery(sql);

            System.out.println("Connection successful");

            //check if data is present
            // System.out.println(rs.next());

            //pointer by default does not point to any data. so we need to make the pointer point to the next element
            rs.next();

            //fetch the data
            String name = rs.getString("sname");

            System.out.println("The name of the student is: "+name);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(con!=null){
                try {
                    con.close();
                    System.out.println("Connection closed");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            
        }
    }
}
