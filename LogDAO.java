package LogAnalyzer;
import java.util.List;

public interface LogDAO {

    void addLog(LogDTO log);

    LogDTO getLogById(int id);

    List<LogDTO> getAllLogs();

    List<LogDTO> getFailedLogs();

    void deleteLog(int id);
}

