package Week6;

import java.sql.*;

public class JDBC_practice {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/employees";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "selam123.";

    public static void main(String[] args) {

        try (
            //Veritabanına bağlan.
            Connection connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            ) {

            //Veritabanına verileri ekle.
            insertData(connect);

            //Veritabanından verileri çek.
            String selectQuery = "SELECT * FROM employees";
            try (ResultSet rs = st.executeQuery(selectQuery)) {

                //Seçilen verileri ekrana yazdır.
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String position = rs.getString("position");
                    double salary = rs.getDouble("salary");
                    System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
                }
            }

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());

        }
    }

    private static void insertData (Connection connect) throws SQLException {

        Statement st = connect.createStatement();

        //employees tablosuna verilerini gir.
        String updateQuery1 = "INSERT INTO employees (id,name,position,salary) VALUES ('1' , 'Ayla Sönmez' , 'Müdür' , '60.000')";
        String updateQuery2 = "INSERT INTO employees (id,name,position,salary) VALUES ('2' , 'Damla Yılmaz' , 'Müdür Yardımcısı' , '50.000')";
        String updateQuery3 = "INSERT INTO employees (id,name,position,salary) VALUES ('3' , 'Kemal Öz' , 'Developer' , '45.000')";
        String updateQuery4 = "INSERT INTO employees (id,name,position,salary) VALUES ('4' , 'Beyza Gül' , 'Finans Çalışanı' , '35.000')";
        String updateQuery5 = "INSERT INTO employees (id,name,position,salary) VALUES ('5' , 'Ahmet Civan' , 'Finans Çalışanı' , '35.000')";

        st.executeUpdate(updateQuery1);
        st.executeUpdate(updateQuery2);
        st.executeUpdate(updateQuery3);
        st.executeUpdate(updateQuery4);
        st.executeUpdate(updateQuery5);

        System.out.println("Veriler eklendi!");

    }
}
