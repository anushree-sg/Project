package LogAnalyzer;
public class LogDTO {

    private int logId;
    private String username;
    private String ipAddress;
    private String eventType;
    private String logTime;

    public LogDTO() {}

    public LogDTO(int logId, String username, String ipAddress, String eventType) {
        this.logId = logId;
        this.username = username;
        this.ipAddress = ipAddress;
        this.eventType = eventType;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public String getUsername() {
        return username;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getEventType() {
        return eventType;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }
}
