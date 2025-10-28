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
            //assume data is coming from front end
            int sid = 102;
            String sname="Jasmine";
            int marks = 52;

            String url = "jdbc:postgresql://localhost:5432/demo";
            String uname="postgres";
            String password = "root";
            // String sql = "select sname from student where sid = 1";
            // String sql = "select * from student";
            // String sql = "insert into student values (5, 'John', 48)";
            // String sql = "update student set sname='Max' where sid=5";
            // String sql = "delete from student where sid=5";
            String sql = "insert into student values (?,?,?)";

            //loads the driver into memory
            //When the class is loaded, it registers itself automatically with the DriverManager.
            Class.forName("org.postgresql.Driver");

            //establish the connection with postgres
            con = DriverManager.getConnection(url, uname, password);

            PreparedStatement st = con.prepareStatement(sql);
            // Statement st = con.createStatement();
            st.setInt(1, sid);
            st.setString(2,sname);
            st.setInt(3, marks);

            st.execute();
            //delete document
            // st.execute(sql);

            //update document
            // st.execute(sql);

            //insert document
            // boolean status = st.execute(sql);
            // System.out.println("Insert status "+status);

            //execute the query
            // ResultSet rs = st.executeQuery(sql);

            //fetch all records
            // while(rs.next()){
            //     System.out.print(rs.getInt(1) + " - ");
            //     System.out.print(rs.getString(2) + " - ");
            //     System.out.println(rs.getInt(3));
            // }


            // -- fetch only one coloumn from one entry
            // System.out.println("Connection successful");

            //check if data is present
            // System.out.println(rs.next());

            //pointer by default does not point to any data. so we need to make the pointer point to the next element
            // rs.next();

            //fetch the data
            // String name = rs.getString("sname");

            // System.out.println("The name of the student is: "+name);

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
