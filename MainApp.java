package LogAnalyzer;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        LogService service = new LogService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- CYBER SECURITY LOG ANALYZER ---");
            System.out.println("1. Add Security Log");
            System.out.println("2. View Log By ID");
            System.out.println("3. View All Logs");
            System.out.println("4. View Failed Login Attempts");
            System.out.println("5. Delete Log");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Username: ");
                    String user = sc.next();
                    System.out.print("IP Address: ");
                    String ip = sc.next();
                    System.out.print("Event Type (SUCCESS/FAILED/ATTACK): ");
                    String event = sc.next();
                    service.addLog(new LogDTO(0, user, ip, event));
                    break;

                case 2:
                    System.out.print("Log ID: ");
                    int id = sc.nextInt();
                    LogDTO log = service.getLog(id);
                    System.out.println(log.getUsername() + " " +
                                       log.getIpAddress() + " " +
                                       log.getEventType() + " " +
                                       log.getLogTime());
                    break;

                case 3:
                    service.getAllLogs().forEach(l ->
                            System.out.println(l.getLogId() + " " +
                                    l.getUsername() + " " +
                                    l.getEventType()));
                    break;

                case 4:
                    service.getFailedLogs().forEach(l ->
                            System.out.println(l.getUsername() + " " +
                                    l.getIpAddress()));
                    break;

                case 5:
                    System.out.print("Log ID: ");
                    service.deleteLog(sc.nextInt());
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}

