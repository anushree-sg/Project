package LogAnalyzer;

import java.util.List;

public class LogService {

    private LogDAO dao = new LogDAOImpl();

    public void addLog(LogDTO log) {
        if (!log.getEventType().equalsIgnoreCase("SUCCESS") &&
            !log.getEventType().equalsIgnoreCase("FAILED") &&
            !log.getEventType().equalsIgnoreCase("ATTACK")) {

            System.out.println("Invalid event type!");
            return;
        }
        dao.addLog(log);
    }

    public LogDTO getLog(int id) {
        return dao.getLogById(id);
    }

    public List<LogDTO> getAllLogs() {
        return dao.getAllLogs();
    }

    public List<LogDTO> getFailedLogs() {
        return dao.getFailedLogs();
    }

    public void deleteLog(int id) {
        dao.deleteLog(id);
    }
}

