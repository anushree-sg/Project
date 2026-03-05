package LogAnalyzer;

import java.sql.*;
import java.util.*;

public class LogDAOImpl implements LogDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/cyberdb";
    private static final String USER = "root";
    private static final String PASS = "anusql28";

    @Override
    public void addLog(LogDTO log) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            String sql = "INSERT INTO security_logs(username, ip_address, event_type) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, log.getUsername());
            pst.setString(2, log.getIpAddress());
            pst.setString(3, log.getEventType());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public LogDTO getLogById(int id) {
        LogDTO log = null;

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            String sql = "SELECT * FROM security_logs WHERE log_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                log = new LogDTO(
                        rs.getInt("log_id"),
                        rs.getString("username"),
                        rs.getString("ip_address"),
                        rs.getString("event_type")
                );
                log.setLogTime(rs.getString("log_time"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return log;
    }

    @Override
    public List<LogDTO> getAllLogs() {
        List<LogDTO> list = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            PreparedStatement pst = con.prepareStatement("SELECT * FROM security_logs");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                LogDTO log = new LogDTO(
                        rs.getInt("log_id"),
                        rs.getString("username"),
                        rs.getString("ip_address"),
                        rs.getString("event_type")
                );
                log.setLogTime(rs.getString("log_time"));
                list.add(log);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<LogDTO> getFailedLogs() {
        List<LogDTO> list = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            PreparedStatement pst =
                    con.prepareStatement("SELECT * FROM security_logs WHERE event_type='FAILED'");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                LogDTO log = new LogDTO(
                        rs.getInt("log_id"),
                        rs.getString("username"),
                        rs.getString("ip_address"),
                        rs.getString("event_type")
                );
                log.setLogTime(rs.getString("log_time"));
                list.add(log);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void deleteLog(int id) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            PreparedStatement pst =
                    con.prepareStatement("DELETE FROM security_logs WHERE log_id=?");
            pst.setInt(1, id);
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
