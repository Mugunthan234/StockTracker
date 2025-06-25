
import java.sql.*;
import java.sql.Date;
import java.text.StringCharacterIterator;
import java.util.*;
import java.time.LocalDate;

public class stockTracker{
public static void main(String[] args) throws Exception {
      readDB();
//      SnoDB();
      updatebyUser();
//      StockName();
//      stockPrice();
//      buyPrice();
//      investedAmount();
//      buyDate();
//      buyCount();
//      brokerName();
//      System.out.println("hi VS Code");

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

        String[] word1 = stockName.split(" ");
        String result1 = "";
        for (String word : word1) {
            if (!word.isEmpty()) {
                result1 += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";}}
        String stockNameUC = result1.trim();

        String[] word2 = brokerName.split(" ");
        String result2 = "";
        for (String word : word2) {
            if (!word.isEmpty()) {
                result2 += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";}}
        String brokerNameUC = result2.trim();

        st.setInt(1, Sno);
        st.setString(2, stockNameUC);
        st.setFloat(3, stockPrice);
        st.setFloat(4, buyPrice);
        st.setDate(5, Date.valueOf(today));
        st.setFloat(6,stockCount);
        st.setString(7, brokerNameUC);

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

}
public static void StockName() throws Exception {
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
        System.out.println("stockPrice: " + rs.getFloat(1));
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
            System.out.println("buyPrice: " + (rs.getFloat(1) + rs.getFloat(+1)));
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
public static void buyCount() throws Exception{
        String url = "jdbc:mysql://localhost:3306/stockTracker";
        String userName = "root";
        String password = "Mugunthan@mysql";
        String query = "select stock_BuyCount from stockDetails";

        Connection conn = DriverManager.getConnection(url,userName,password);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            System.out.println("BuyCount: " + rs.getFloat(1));
        }
}
public static void brokerName() throws Exception{
        String url = "jdbc:mysql://localhost:3306/stockTracker";
        String userName = "root";
        String password = "Mugunthan@mysql";
        String query = "select Broker_Name from stockDetails";

        Connection conn = DriverManager.getConnection(url,userName,password);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            System.out.println("BrokerName:"+ rs.getString(1));
        }
}
public static void investedAmount() throws Exception{
        String url = "jdbc:mysql://localhost:3306/stockTracker";
        String user = "root";
        String password = "Mugunthan@mysql";
        String query = "SELECT SUM(stock_BuyPrice) AS total_StockPrice FROM stockDetails";

            // Load JDBC Driver
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to Database
            Connection con = DriverManager.getConnection(url, user, password);
            // Create Statement and Execute Query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            // Process Result
            if (rs.next()) {
                double totalAmount = rs.getDouble("total_StockPrice");
                System.out.println("Total Amount Invested: " + totalAmount);
        }
    }
}