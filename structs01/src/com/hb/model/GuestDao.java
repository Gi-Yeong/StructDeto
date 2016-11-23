package com.hb.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GuestDao {
    private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String user = "scott";
    private final String password = "tiger";
    private final Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public GuestDao() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        conn = DriverManager.getConnection(url, user, password);
    }

    public List<GuestVo> selectAll() throws SQLException {
        List<GuestVo> list = new ArrayList<>();
        try {
            pstmt = conn.prepareStatement("SELECT * FROM GUEST");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                list.add(new GuestVo(
                        rs.getInt("sabun"),
                        rs.getString("name"),
                        rs.getDate("nalja"),
                        rs.getInt("pay")
                ));
            }
        } finally {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        }

        return list;
    }

    public void insertOne(int sabun, String name, int pay) throws SQLException {
        try {
            pstmt = conn.prepareStatement("INSERT INTO GUEST VALUES (?, ?, sysdate, ?)");
            pstmt.setInt(1, sabun);
            pstmt.setString(2, name);
            pstmt.setInt(3, pay);
            pstmt.executeUpdate();
        } finally {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        }

    }
}
