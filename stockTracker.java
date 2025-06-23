import com.mysql.cj.protocol.x.ResultMessageListener;

import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.time.LocalDate;



public class stockTracker{
public static void main(String[] args) throws Exception {
//        readDB();
//        SnoDB();
//        updatebyUser();
//        StockName();
//stockPrice();
//    buyPrice();
    buyDate();
}
 public static void insertUpdate1() throws Exception{
        String url = "jdbc:mysql://localhost:3306/stockTracker";
        String userName = "root";
        String password = "root";
        String query = "insert into stockDetails values()";

        Connection conn = DriverManager.getConnection(url, userName, password);
        Statement st = conn.createStatement();
        int row = st.executeUpdate(query);
        System.out.print("Rows affected "+row);
    }
    public static void updatebyUser() throws Exception{
        Scanner sc = new Scanner(System.in);
     LocalDate today = LocalDate.now();

        System.out.println("Sno: ");
        int Sno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the StockName: ");
        String stockName = sc.nextLine();
        System.out.println("Enter StockPrice: ");
        float stockPrice = sc.nextFloat();
        System.out.println("Enter BuyPrice: ");
        float buyPrice = sc.nextFloat();
        System.out.println("Enter StockCount: ");
        float stockCount= sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter BrokerName: ");
        String brokerName = sc.nextLine();

        //Database Section
        String url = "jdbc:mysql://localhost:3306/stockTracker";
        String userName = "root";
        String password = "Mugunthan@mysql";
        String query = "insert into stockDetails values(?,?,?,?,?,?,?);";

        Connection conn = DriverManager.getConnection(url, userName, password);
        PreparedStatement st = conn.prepareStatement(query);

        st.setInt(1, Sno);
        st.setString(2, stockName);
        st.setFloat(3, stockPrice);
        st.setFloat(4, buyPrice);
        st.setDate(5, Date.valueOf(today));
        st.setFloat(6,stockCount);
        st.setString(7, brokerName);

        int r = st.executeUpdate();

        System.out.print("Rows affected "+r);

    }


public static void readDB() throws Exception {
    String url = "jdbc:mysql://localhost:3306/stockTracker";
    String userName = "root";
    String password = "Mugunthan@mysql";
    String query = "select * from stockDetails;";

    Connection conn = DriverManager.getConnection(url, userName, password);
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery(query);

    while (rs.next()) {
        System.out.println("Sno: " + rs.getInt(1));
        System.out.println("StockName: " + rs.getString(2));
        System.out.println("StockPrice: " + rs.getFloat(3));
        System.out.println("BuyPrice: " + rs.getFloat(4));
        System.out.println("BuyDate: " + rs.getDate(5));
        System.out.println("StockCount: " + rs.getFloat(6));
        System.out.println("BrokerName: " + rs.getString(7));

        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
public static void SnoDB() throws SQLException {

    String url = "jdbc:mysql://localhost:3306/stockTracker";
    String userName = "root";
    String password ="Mugunthan@mysql";
    String query = "select Sno from stockDetails";

    Connection conn = DriverManager.getConnection(url, userName, password);
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery(query);

    while(rs.next()){
        System.out.println("Sno: " + rs.getInt(1));
    }

}public static void StockName() throws Exception {
        String url = "jdbc:mysql://localhost:3306/stockTracker";
        String userName = "root";
        String password = "Mugunthan@mysql";
        String query = "select Stock_Name from stockDetails";

        Connection conn = DriverManager.getConnection(url, userName, password);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println("StockName: " + rs.getString(1));
        }


    }
    public static void stockPrice() throws Exception{
    String url = "jdbc:mysql://localhost:3306/stockTracker";
    String userName = "root";
    String password = "Mugunthan@mysql";
    String query = "select Stock_Price from stockDetails";

    Connection conn = DriverManager.getConnection(url,userName,password);
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery(query);

    while(rs.next()){
        System.out.println("stockPrice: " + rs.getInt(1));
    }
    }

    public static void buyPrice() throws Exception{
        String url = "jdbc:mysql://localhost:3306/stockTracker";
        String userName = "root";
        String password = "Mugunthan@mysql";
        String query = "select stock_BuyPrice from stockDetails";

        Connection conn = DriverManager.getConnection(url,userName,password);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            System.out.println("buyPrice: " + rs.getInt(1));
        }
    }
    public static void buyDate() throws Exception{
        String url = "jdbc:mysql://localhost:3306/stockTracker";
        String userName = "root";
        String password = "Mugunthan@mysql";
        String query = "select stock_BuyDate from stockDetails";

        Connection conn = DriverManager.getConnection(url,userName,password);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            System.out.println("buyDate: " + rs.getDate(1));
        }
    }
    }
